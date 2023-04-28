/* eslint-disable react-refresh/only-export-components */
import {
  Outlet,
  useLoaderData,
  Form,
  NavLink,
  useNavigation,
  useSubmit,
} from "react-router-dom";
import { getContacts, createContact } from "../contacts";

/**
 * loader digunakan untuk memuat data yang akan ditampilkan
 * loader akan mengembalikan data contacts
 */

// export async function loader() {
//   const contacts = await getContacts();
//   return { contacts };
// }

export async function loader({ request }) {
  const url = new URL(request.url);
  const q = url.searchParams.get("q");
  const contacts = await getContacts(q);
  return { contacts, q };
}

/**
 * action digunakan untuk memuat data yang akan ditampilkan ketika ada perubahan data
 * @returns contact
 */

export async function action() {
  const contact = await createContact();
  return { contact };
}

export default function Root() {
  /**
   * useLoaderData digunakan untuk mengambil data yang telah dimuat oleh loader
   * contacts akan digunakan untuk menampilkan daftar kontak
   */
  const { contacts, q } = useLoaderData();

  /**
   * useNavigation digunakan untuk menentukan navigasi yang akan digunakan untuk menampilkan kontak yang dipilih
   */
  const navigation = useNavigation();

  /**
   * useSubmit digunakan untuk menentukan submit yang akan digunakan untuk menampilkan kontak yang dipilih
   */
  const submit = useSubmit();

  const searching =
    navigation.location &&
    new URLSearchParams(navigation.location.search).has("q");

  return (
    <>
      <div id="sidebar">
        <h1>React Router Contacts</h1>
        <div>
          {/* <!-- 1. This form is for searching contacts. --> */}
          <Form id="search-form" role="search">
            <input
              id="q"
              className={searching ? "loading" : ""}
              aria-label="Search contacts"
              placeholder="Search"
              type="search"
              name="q"
              defaultValue={q}
              onChange={(event) => {
                const isFirstSearch = q == null;
                submit(event.currentTarget.form, {
                  replace: !isFirstSearch,
                });
              }}
            />
            {/* <!-- 2. When the form is submitted, a spinner is shown. --> */}
            <div id="search-spinner" aria-hidden hidden={!searching} />
            {/* <!-- 3. When the form is submitted, the user is notified that the page is loading. --> */}
            <div className="sr-only" aria-live="polite"></div>
          </Form>
          <Form method="post">
            <button type="submit">New</button>
          </Form>
        </div>
        <nav>
          {/* if there are contacts... */}
          {contacts.length ? (
            // ...display the contacts
            <ul>
              {contacts.map((contact) => (
                <li key={contact.id}>
                  <NavLink
                    to={`contacts/${contact.id}`}
                    className={({ isActive, isPending }) =>
                      isActive ? "active" : isPending ? "pending" : ""
                    }
                  >
                    {/* <Link to={`contacts/${contact.id}`}> */}
                    {contact.first || contact.last ? (
                      <>
                        {contact.first} {contact.last}
                      </>
                    ) : (
                      <i>No Name</i>
                    )}{" "}
                    {contact.favorite && <span>★</span>}
                    {/* </Link> */}
                  </NavLink>
                </li>
              ))}
            </ul>
          ) : (
            // ...otherwise, display a message
            <p>
              <i>No contacts</i>
            </p>
          )}
        </nav>
      </div>
      <div
        id="detail"
        className={navigation.state === "loading" ? "loading" : ""}
      >
        <Outlet />
      </div>
    </>
  );
}

/**
 * Outlet digunakan untuk menampilkan komponen yang sesuai dengan route yang digunakan
 * Link digunakan untuk membuat link yang akan digunakan untuk menentukan route yang akan digunakan
 * useLoaderData digunakan untuk mengambil data yang telah dimuat oleh loader dan action
 * Form digunakan untuk membuat form yang akan digunakan untuk membuat kontak baru ketika tombol submit ditekan
 * UseNavigation digunakan untuk mengambil data navigasi yang akan digunakan untuk menentukan apakah halaman sedang dimuat atau tidak. Jika halaman sedang dimuat maka akan ditampilkan loading spinner dan pesan loading di halaman detail kontak yang sedang dimuat tersebut.
 */
