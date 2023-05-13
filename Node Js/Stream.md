# Stream Node Js

## Stream

Stream adalah konsep yang sangat penting dalam Node.js. Hampir semua objek dalam Node.js adalah stream. Stream adalah objek yang memungkinkan kita untuk membaca data secara asynchronous (non-blocking) atau menulis data ke tempat tujuan, sebagian data pada satu waktu.

## Tipe Stream

Ada empat jenis stream dalam Node.js:

- Readable - Untuk operasi input

- Writable - Untuk operasi output

- Duplex - Untuk operasi input dan output

- Transform - Untuk operasi input dan output yang dapat dimodifikasi

## Readable Stream

Readable stream adalah stream yang digunakan untuk operasi input. Contoh operasi input adalah membaca file, membaca data dari database, dan menerima request HTTP.

```javascript
import fs from "fs";

const readable = fs.createReadStream("input.txt");

readable.on("data", (chunk) => {
  console.log(chunk);
});
```

## Writable Stream

Writable stream adalah stream yang digunakan untuk operasi output. Contoh operasi output adalah menulis file, menulis data ke database, dan mengirim response HTTP.

```javascript
import fs from "fs";

const writable = fs.createWriteStream("output.txt");

writable.write("Hello World!");
```

## Duplex Stream

Duplex stream adalah stream yang digunakan untuk operasi input dan output. Contoh operasi input dan output adalah koneksi TCP.

```javascript
import net from "net";

const server = net.createServer((socket) => {
  socket.write("Hello World!");
});

server.listen(8000);
```

## Transform Stream

Transform stream adalah stream yang digunakan untuk operasi input dan output yang dapat dimodifikasi. Contoh operasi input dan output yang dapat dimodifikasi adalah zlib.createGzip() dan zlib.createGunzip().

```javascript
import fs from "fs";
import zlib from "zlib";

const readable = fs.createReadStream("input.txt");

const writable = fs.createWriteStream("output.txt");

const compressed = fs.createWriteStream("output.txt.gz");

const gzip = zlib.createGzip();

readable.pipe(writable);

// readable.pipe(writable) sama dengan:
// readable.on("data", (chunk) => {
//   writable.write(chunk);
// });
```

## Pipe

Pipe adalah metode yang digunakan untuk menghubungkan output dari readable stream ke input dari writable stream.

```javascript
import fs from "fs";

const readable = fs.createReadStream("input.txt");

const writable = fs.createWriteStream("output.txt");

readable.pipe(writable);

// readable.pipe(writable) sama dengan:
// readable.on("data", (chunk) => {
//   writable.write(chunk);
// });
```
