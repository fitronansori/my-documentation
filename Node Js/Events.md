# Events Node Js

## Events

Events adalah suatu mekanisme yang memungkinkan kita untuk membuat kode yang berjalan secara asynchronous (berjalan di latar belakang) menjadi synchronous (berjalan di depan). Dengan kata lain, kita bisa membuat kode yang berjalan di latar belakang menjadi berjalan di depan.

## EventEmitter

Modul events adalah modul inti dalam Node.js yang digunakan untuk mengimplementasikan mekanisme event-driven di dalam aplikasi. Modul ini menyediakan fungsionalitas untuk membuat, mendaftarkan, memicu, dan mendengarkan event.

Konsep utama dalam modul events adalah EventEmitter. EventEmitter adalah kelas yang digunakan untuk membuat objek yang dapat memicu dan mendengarkan event.

```javascript
import { EventEmitter } from "events";

const myEventEmitter = new EventEmitter();

// Mendaftarkan listener ke event 'newSale'

myEventEmitter.on("newSale", () => {
  console.log("There was a new sale!");
});

// Mendaftarkan listener ke event 'newSale'

myEventEmitter.on("newSale", () => {
  console.log("Customer name: Jonas");
});

// Mendaftarkan listener ke event 'newSale'

myEventEmitter.on("newSale", (stock) => {
  console.log(`There are now ${stock} items left in stock.`);
});

// Memanggil event 'newSale'

myEventEmitter.emit("newSale", 9); // There was a new sale! Customer name: Jonas There are now 9 items left in stock.
```

## EventEmitter Class

- `on(eventName, listener)` - Mendaftarkan listener ke event yang diberikan

- `emit(eventName)` - Memanggil semua listener yang terdaftar ke event yang diberikan

- `once(eventName, listener)` - Mendaftarkan listener ke event yang diberikan hanya sekali

- `removeListener(eventName, listener)` - Menghapus listener yang terdaftar dari event yang diberikan

- `off(eventName, listener)` - Menghapus listener yang terdaftar dari event yang diberikan

- `addListener(eventName, listener)` - Mendaftarkan listener ke event yang diberikan

- `prependListener(eventName, listener)` - Mendaftarkan listener ke event yang diberikan ke awal listener array

- `prependOnceListener(eventName, listener)` - Mendaftarkan listener ke event yang diberikan ke awal listener array hanya sekali

- `removeAllListeners([eventName])` - Menghapus semua atau beberapa listener dari event yang diberikan

- `setMaxListeners(n)` - Mengatur jumlah maksimum listener untuk Event Emitter

- `listeners(eventName)` - Mengembalikan array listener yang terdaftar untuk event yang diberikan

- `emit(eventName[, ...args])` - Memanggil setiap listener yang terdaftar ke event yang diberikan

- `eventNames()` - Mengembalikan array string yang berisi event yang terdaftar

- `listenerCount(eventName)` - Mengembalikan jumlah listener yang terdaftar untuk event yang diberikan

- `rawListeners(eventName)` - Mengembalikan array listener yang terdaftar untuk event yang diberikan
