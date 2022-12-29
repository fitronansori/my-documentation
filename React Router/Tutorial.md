# React Router Dom 6.4 Tutorial

## 1. React Router Dom

- React Router Dom adalah library yang digunakan untuk membuat routing pada aplikasi React.

- React Router Dom memiliki dua jenis routing yaitu:

  - Static Routing (React Router Dom 5.2)
  - Dynamic Routing (React Router Dom 6.4)

## 2. Instalasi

- Untuk menginstall React Router Dom, jalankan perintah berikut pada terminal:

  ```bash
  npm install react-router-dom
  ```

## 3. Menambahkan Routing pada Aplikasi React

```jsx
import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import "./index.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />, // element yang akan ditampilkan pada path tersebut
    errorElement: <ErrorPage />,
    // children adalah routing yang akan ditampilkan pada path tersebut
    children: [
      {
        path: "contacts/:contactId",
        element: <Contact />,
      },
    ],
  },
  // membuat routing baru
  //   {
  //     path: "contacts/:contactId",
  //     element: <Contact />,
  //   },
]);

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
```

- path adalah path yang akan ditampilkan pada browser.
- element adalah komponen yang akan ditampilkan pada path tersebut.
- createBrowserRouter() adalah fungsi yang digunakan untuk membuat routing pada aplikasi React.
- RouterProvider adalah komponen yang digunakan untuk mengatur routing pada aplikasi React.
- errorElement adalah komponen yang akan ditampilkan jika path tidak ditemukan.
- Children adalah routing yang akan ditampilkan pada path tersebut.
