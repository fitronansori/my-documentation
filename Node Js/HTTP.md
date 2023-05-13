# HTTP Node Js

Modul http adalah modul bawaan dalam Node.js yang menyediakan fungsionalitas untuk membuat server HTTP dan mengelola permintaan dan respons HTTP. Modul ini memungkinkan Anda untuk membuat server HTTP yang dapat menerima permintaan dari klien dan memberikan respons yang sesuai.

Untuk menggunakan modul http, Anda perlu mengimpornya ke dalam kode Anda:

```javascript
const http = require("http");
```

Setelah mengimpor modul http, Anda dapat menggunakan fungsi-fungsi dan objek-objek yang disediakan oleh modul tersebut.

Berikut adalah beberapa aspek penting dari modul http:

## Membuat server HTTP

http.createServer(options,requestListener): Metode ini digunakan untuk membuat server HTTP. Anda dapat memberikan fungsi penangan permintaan opsional yang akan dipanggil setiap kali ada permintaan yang diterima oleh server.

Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  // Logika penangan permintaan
});
```

## Menangani permintaan

Objek request: Objek ini berisi informasi tentang permintaan HTTP yang diterima oleh server, seperti URL, metode HTTP, header, dan lainnya.
Objek response: Objek ini digunakan untuk mengirim respons kembali ke klien. Anda dapat mengatur status kode, header, dan mengirimkan konten respons menggunakan objek ini.
Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  // Menangani permintaan
  res.statusCode = 200;
  res.setHeader("Content-Type", "text/plain");
  res.end("Hello, World!");
});
```

## Routing

Dalam penangan permintaan, Anda dapat menggunakan properti req.url untuk menentukan tindakan yang harus diambil berdasarkan URL yang diminta oleh klien.
Anda dapat menggunakan if atau switch statements untuk mengarahkan permintaan ke penangan yang sesuai berdasarkan URL.
Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  if (req.url === "/") {
    res.statusCode = 200;
    res.setHeader("Content-Type", "text/plain");
    res.end("Home Page");
  } else if (req.url === "/about") {
    res.statusCode = 200;
    res.setHeader("Content-Type", "text/plain");
    res.end("About Page");
  } else {
    res.statusCode = 404;
    res.setHeader("Content-Type", "text/plain");
    res.end("Page Not Found");
  }
});
```

## Mengelola metode HTTP

Anda dapat menggunakan properti req.method untuk menentukan metode HTTP yang digunakan oleh klien.
Dengan menggunakan if atau switch statements, Anda dapat mengelola permintaan berdasarkan metode HTTP yang diterima.
Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  if (req.method === "GET") {
    // Penanganan permintaan GET
  } else if (req.method === "POST") {
    // Penanganan permintaan POST
  } else {
    // Penanganan permintaan metode lainnya
  }
});
```

## Menerima data permintaan

Jika klien mengirimkan data dalam permintaan, Anda dapat mengaksesnya melalui objek request.
Untuk permintaan dengan metode POST, PUT, atau PATCH, Anda perlu mengonfigurasi penangan permintaan untuk membaca data tubuh permintaan menggunakan event data dan end.
Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  if (req.method === "POST") {
    let body = "";
    req.on("data", (chunk) => {
      body += chunk;
    });
    req.on("end", () => {
      // Penanganan data permintaan POST setelah data diterima sepenuhnya
      console.log(body);
      res.statusCode = 200;
      res.end("Data received");
    });
  }
});
```

## Menangani kesalahan

Anda dapat menangani kesalahan yang terjadi selama penangan permintaan menggunakan event error.
Misalnya, jika ada kesalahan dalam membaca data permintaan, Anda dapat memberikan respons kesalahan yang sesuai.
Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  req.on("error", (err) => {
    console.error(err);
    res.statusCode = 400;
    res.end("Bad Request");
  });
});
```

## Mendengarkan port dan host

Setelah server dibuat, Anda perlu mendengarkan port dan host tertentu agar server dapat menerima permintaan dari klien.
Anda dapat menggunakan metode server.listen() untuk mendefinisikan port dan host yang akan didengarkan oleh server.
Contoh penggunaan:

```javascript
const server = http.createServer((req, res) => {
  // Penangan permintaan
});

const port = 3000;
const host = "localhost";

server.listen(port, host, () => {
  console.log(`Server berjalan di http://${host}:${port}`);
});
```

Itulah beberapa aspek penting dari modul http dalam Node.js. Modul ini memungkinkan Anda untuk membuat server HTTP yang dapat menerima permintaan dari klien dan memberikan respons yang sesuai. Dengan memahami dan menguasai modul http, Anda dapat membangun aplikasi server-side yang kuat dan responsif menggunakan Node.js.

## Content-Type

Content-Type adalah header HTTP yang digunakan untuk menentukan jenis konten yang dikirim dalam respons. Ini digunakan oleh klien untuk menentukan jenis konten yang diterima dari server. Ini juga digunakan oleh server untuk menentukan jenis konten yang dikirim ke klien.

jenis konten yang paling umum adalah:

- text/plain - Teks biasa tanpa format khusus.
- text/html - Dokumen HTML. Ini adalah jenis konten default untuk browser web.
- application/json - Data JSON.
- image/jpeg - Gambar JPEG.
- image/png - Gambar PNG.
- application/octet-stream - Data biner.
- multipart/form-data - Data formulir yang dikirim sebagai bagian dari permintaan multipart.
