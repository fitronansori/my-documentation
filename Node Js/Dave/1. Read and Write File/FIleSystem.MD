# File System Node JS

## File Handle

- File Handle adalah fungsi yang digunakan untuk membuka file yang ada di dalam direktori.

```javascript
// Asynchronous open / Non-Blocking / Promise
import fs from "fs/promises";

const openFile = async () => {
  try {
    const data = await fs.open("./data.txt", "r");
    console.log(data);
  } catch (error) {
    console.log(error);
  }
};

openFile();
```

```javascript
// Synchronous open / Blocking / Callback

const fs = require("fs");

fs.open("./data.txt", "r", (err, data) => {
  if (err) {
    console.log(err);
  } else {
    console.log(data);
  }
});
```

## Read File

- ReadFile adalah fungsi yang digunakan untuk membaca file yang ada di dalam direktori.

```javascript
// Asynchronous read / Non-Blocking / Promise
import fs from "fs/promises";

const readFile = async () => {
  try {
    const data = await fs.readFile("./data.txt", "utf-8");
    console.log(data);
  } catch (error) {
    console.log(error);
  }
};

readFile();
```

```javascript
// Synchronous read / Blocking / Callback

const fs = require("fs");

fs.readFile("./data.txt", "utf-8", (err, data) => {
  if (err) {
    console.log(err);
  } else {
    console.log(data);
  }
});
```

## Write File

- WriteFile adalah fungsi yang digunakan untuk menulis file yang ada di dalam direktori.

```javascript
// Asynchronous write / Non-Blocking / Promise

import fs from "fs/promises";

const writeFile = async () => {
  try {
    await fs.writeFile("./data.txt", "Hello World");
    console.log("Write File Success");
  } catch (error) {
    console.log(error);
  }
};

writeFile();
```

```javascript
// Synchronous write / Blocking / Callback

const fs = require("fs");

fs.writeFile("./data.txt", "Hello World", (err) => {
  if (err) {
    console.log(err);
  } else {
    console.log("Write File Success");
  }
});
```

## Append File

- AppendFile adalah fungsi yang digunakan untuk menambahkan file yang ada di dalam direktori.

```javascript
// Asynchronous append / Non-Blocking / Promise

import fs from "fs/promises";

const appendFile = async () => {
  try {
    await fs.appendFile("./data.txt", "Hello World");
    console.log("Append File Success");
  } catch (error) {
    console.log(error);
  }
};

appendFile();
```

```javascript
// Synchronous append / Blocking / Callback

const fs = require("fs");

fs.appendFile("./data.txt", "Hello World", (err) => {
  if (err) {
    console.log(err);
  } else {
    console.log("Append File Success");
  }
});
```

## Delete File

- DeleteFile adalah fungsi yang digunakan untuk menghapus file yang ada di dalam direktori.

```javascript
// Asynchronous delete / Non-Blocking / Promise

import fs from "fs/promises";

const deleteFile = async () => {
  try {
    await fs.unlink("./data.txt");
    console.log("Delete File Success");
  } catch (error) {
    console.log(error);
  }
};

deleteFile();
```

```javascript
// Synchronous delete / Blocking / Callback

const fs = require("fs");

fs.unlink("./data.txt", (err) => {
  if (err) {
    console.log(err);
  } else {
    console.log("Delete File Success");
  }
});
```

## Rename File

- RenameFile adalah fungsi yang digunakan untuk mengubah nama file yang ada di dalam direktori.

```javascript
// Asynchronous rename / Non-Blocking / Promise

import fs from "fs/promises";

const renameFile = async () => {
  try {
    await fs.rename("./data.txt", "./data2.txt");
    console.log("Rename File Success");
  } catch (error) {
    console.log(error);
  }
};

renameFile();
```

```javascript
// Synchronous rename / Blocking / Callback

const fs = require("fs");

fs.rename("./data.txt", "./data2.txt", (err) => {
  if (err) {
    console.log(err);
  } else {
    console.log("Rename File Success");
  }
});
```

## Copy File

- CopyFile adalah fungsi yang digunakan untuk menyalin file yang ada di dalam direktori.

```javascript
// Asynchronous copy / Non-Blocking / Promise

import fs from "fs/promises";

const copyFile = async () => {
  try {
    await fs.copyFile("./data.txt", "./data2.txt");
    console.log("Copy File Success");
  } catch (error) {
    console.log(error);
  }
};

copyFile();
```

## Membuat Folder

- MembuatFolder adalah fungsi yang digunakan untuk membuat folder yang ada di dalam direktori.

```javascript
// Asynchronous mkdir / Non-Blocking / Promise

import fs from "fs/promises";

const mkdir = async () => {
  try {
    await fs.mkdir("./data");
    console.log("Create Folder Success");
  } catch (error) {
    console.log(error);
  }
};

mkdir();
```

## Membaca Folder

- MembacaFolder adalah fungsi yang digunakan untuk membaca folder yang ada di dalam direktori.

```javascript
// Asynchronous readdir / Non-Blocking / Promise

import fs from "fs/promises";

const readdir = async () => {
  try {
    const data = await fs.readdir("./data");
    console.log(data);
  } catch (error) {
    console.log(error);
  }
};

readdir();
```

## Menghapus Folder

- MenghapusFolder adalah fungsi yang digunakan untuk menghapus folder yang ada di dalam direktori.

```javascript
// Asynchronous rmdir / Non-Blocking / Promise

import fs from "fs/promises";

const rmdir = async () => {
  try {
    await fs.rmdir("./data");
    console.log("Delete Folder Success");
  } catch (error) {
    console.log(error);
  }
};

rmdir();
```

## Menghapus Folder dan Isinya

- MenghapusFolderDanIsinya adalah fungsi yang digunakan untuk menghapus folder dan isinya yang ada di dalam direktori.

```javascript
// Asynchronous rmdir / Non-Blocking / Promise

import fs from "fs/promises";

const rmdir = async () => {
  try {
    await fs.rmdir("./data", { recursive: true });
    console.log("Delete Folder Success");
  } catch (error) {
    console.log(error);
  }
};

rmdir();
```
