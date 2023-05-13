# Path Module Node Js

## Path Module

Modul path adalah modul bawaan dalam Node.js yang menyediakan utilitas untuk bekerja dengan jalur file dan direktori pada sistem operasi. Modul ini berguna untuk mengelola jalur file secara platform-agnostik, sehingga Anda dapat memanipulasi jalur file dengan benar, terlepas dari sistem operasi yang digunakan.

### Menggunakan Path Module

Untuk menggunakan modul path, kita perlu mengimpornya terlebih dahulu menggunakan require.

```javascript
import path from "path";
```

## Module yang di sediakan oleh Path Module

### path.basename(path[, ext])

Method ini mengembalikan bagian terakhir dari path, seperti nama file.

```javascript
import path from "path";

const filePath = "/home/user/index.js";

const fileName = path.basename(filePath);

console.log(fileName); // index.js
```

### path.delimiter

Properti ini mengembalikan delimiter platform-spesifik yang digunakan untuk memisahkan path.

```javascript
import path from "path";

const delimiter = path.delimiter;

console.log(delimiter); // :
```

### path.dirname(path)

Method ini mengembalikan direktori dari path.

```javascript
import path from "path";

const filePath = "/home/user/index.js";

const directory = path.dirname(filePath);

console.log(directory); // /home/user
```

### path.extname(path)

Method ini mengembalikan ekstensi dari path.

```javascript
import path from "path";

const filePath = "/home/user/index.js";

const ext = path.extname(filePath);

console.log(ext); // .js
```

### path.format(pathObject)

Method ini mengembalikan path dari objek path.

```javascript
import path from "path";

const pathObject = {
  dir: "/home/user",
  base: "index.js",
};

const filePath = path.format(pathObject);

console.log(filePath); // /home/user/index.js
```

### path.isAbsolute(path)

Method ini mengembalikan true jika path yang diberikan adalah absolute path, false jika tidak.

```javascript
import path from "path";

const filePath = "/home/user/index.js";

const isAbsolute = path.isAbsolute(filePath);

console.log(isAbsolute); // true
```

### path.join([...paths])

Method ini menggabungkan semua path yang diberikan dan mengembalikan path yang sudah digabungkan.

```javascript
import path from "path";

const filePath = path.join("/home", "user", "index.js");

console.log(filePath); // /home/user/index.js
```

### path.normalize(path)

Method ini mengembalikan path yang sudah dinormalisasi.

```javascript
import path from "path";

const filePath = path.normalize("/home/user/../user/index.js");

console.log(filePath); // /home/user/index.js
```

### path.parse(path)

Method ini mengembalikan objek path.

```javascript
import path from "path";

const filePath = "/home/user/index.js";

const pathObject = path.parse(filePath);

console.log(pathObject);
// {
//   root: '/',
//   dir: '/home/user',
//   base: 'index.js',
//   ext: '.js',
//   name: 'index'
// }
```

### path.posix

Properti ini mengembalikan objek path yang menggunakan path separator POSIX.

```javascript
import path from "path";

const posixPath = path.posix;

console.log(posixPath);
// {
//   resolve: [Function: resolvePath],
//   normalize: [Function: normalizeString],
//   isAbsolute: [Function: isAbsolute],
//   join: [Function: join],
//   relative: [Function: relative],
//   _makeLong: [Function: toNamespacedPath],
//   dirname: [Function: dirname],
//   basename: [Function: basename],
//   extname: [Function: extname],
//   format: [Function: bound _format],
//   parse: [Function: parse],
//   sep: '/',
//   delimiter: ':',
//   win32: [Circular *1],
//   posix: [Circular *1]
// }
```

### path.relative(from, to)

Method ini mengembalikan path relatif dari from ke to.

```javascript
import path from "path";

const from = "/home/user";
const to = "/home/user/index.js";

const relativePath = path.relative(from, to);

console.log(relativePath); // index.js
```

### path.resolve([...paths])

Method ini mengembalikan path yang sudah di-resolve.

```javascript
import path from "path";

const filePath = path.resolve("/home", "user", "index.js");

console.log(filePath); // /home/user/index.js
```
