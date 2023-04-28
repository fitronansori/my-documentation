/* eslint-disable react-refresh/only-export-components */
import { Form, useLoaderData, redirect, useNavigate } from "react-router-dom";
import { updateContact } from "../contacts";

export async function action({ request, params }) {
  // Get the form data.
  const formData = await request.formData();
  // object.fromEntries() mengembalikan array yang berisi elemen array key-value dari objek yang diberikan.
  const updates = Object.fromEntries(formData);
  await updateContact(params.contactId, updates);

  // Redirect to the contact's page.
  return redirect(`/contacts/${params.contactId}`);
}

export default function EditContact() {
  const { contact } = useLoaderData();

  const navigate = useNavigate();

  return (
    <Form method="post" id="contact-form">
      <p>
        <span>Name</span>
        <input
          placeholder="First"
          aria-label="First name"
          type="text"
          name="first"
          defaultValue={contact.first}
        />
        <input
          placeholder="Last"
          aria-label="Last name"
          type="text"
          name="last"
          defaultValue={contact.last}
        />
      </p>
      <label>
        <span>Twitter</span>
        <input
          type="text"
          name="twitter"
          placeholder="@jack"
          defaultValue={contact.twitter}
        />
      </label>
      <label>
        <span>Avatar URL</span>
        <input
          placeholder="https://example.com/avatar.jpg"
          aria-label="Avatar URL"
          type="text"
          name="avatar"
          defaultValue={contact.avatar}
        />
      </label>
      <label>
        <span>Notes</span>
        <textarea name="notes" defaultValue={contact.notes} rows={6} />
      </label>
      <p>
        <button type="submit">Save</button>
        <button
          type="button"
          onClick={() => {
            navigate(-1); // kembali ke halaman sebelumnya
          }}
        >
          Cancel
        </button>
      </p>
    </Form>
  );
}

/**
 * redirect adalah fungsi yang digunakan untuk mengarahkan pengguna ke halaman lain. Fungsi ini menerima satu argumen, yaitu path yang akan dituju oleh pengguna. Fungsi ini mengembalikan objek redirect yang akan diteruskan ke router.
 */
