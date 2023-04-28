import React from "react";
import ReactDOM from "react-dom/client";
// import App from "./App.jsx";
import Root, {
  loader as rootLoader,
  action as rootAction,
} from "./routes/root";
import ErrorPage from "./error-page";
import Contact, {
  loader as contactLoader,
  action as contactAction,
} from "./routes/contact";
import EditContact, { action as editAction } from "./routes/edit";
import { action as destroyAction } from "./routes/destroy";
import Index from "./routes/index";
import "./index.css";

/**
 * import
 * createBrowserRouter digunakan untuk membuat router baru
 * RouterProvider digunakan untuk menyediakan router yang telah dibuat
 */
import { createBrowserRouter, RouterProvider } from "react-router-dom";

// membuat router, router ini akan digunakan untuk menentukan route yang akan digunakan
const router = createBrowserRouter([
  {
    path: "/",
    element: <Root />,
    errorElement: <ErrorPage />,
    loader: rootLoader,
    action: rootAction,
    children: [
      // kenapa index: true? karena route ini akan digunakan sebagai route default ketika route yang ditentukan tidak ditemukan
      { index: true, element: <Index /> },
      {
        path: "/contacts/:contactId",
        element: <Contact />,
        loader: contactLoader,
        action: contactAction,
      },
      {
        path: "contacts/:contactId/edit",
        element: <EditContact />,
        loader: contactLoader,
        action: editAction,
      },
      {
        path: "contacts/:contactId/destroy",
        action: destroyAction,
      },
    ],
  },
]);

/**
 * path : route yang akan digunakan
 * element : komponen yang akan ditampilkan
 * errorElement : komponen yang akan ditampilkan jika terjadi error
 * path with id : route yang akan digunakan dengan parameter id yang akan digunakan untuk menentukan kontak yang akan ditampilkan
 * loader : fungsi yang akan digunakan untuk memuat data yang akan ditampilkan
 * action : fungsi yang akan digunakan untuk memuat data yang akan ditampilkan ketika ada perubahan data
 */

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
