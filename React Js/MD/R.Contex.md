# React Context

## Context

- Context menyediakan cara untuk pass data melalui rantai komponen tanpa harus secara eksplisit mengirim prop di setiap level komponen.

- Context dirancang untuk membagikan data yang dapat dianggap "global" untuk komponen pohon React, seperti pengautentikasian saat ini pengguna, tema, atau preferensi bahasa.

## Create Context

- Buat file baru dengan nama `context.js` di dalam folder `src` dan ketikkan kode berikut:

```js
import React from "react";

const Context = React.createContext();

export default Context;
```

## Provider

- Buat file baru dengan nama `Provider.js` di dalam folder `src` dan ketikkan kode berikut:

```js
import React, { useState } from "react";

import Context from "./context";

const Provider = (props) => {
  const [state, setState] = useState({
    name: "Fikri",
    age: 20,
  });

  const growAYearOlder = () =>
    setState({
      ...state,
      age: state.age + 1,
    });

  return (
    <Context.Provider
      value={{
        state,
        growAYearOlder,
      }}
    >
      {props.children}
    </Context.Provider>
  );
};

export default Provider;
```

## App

- Buat file baru dengan nama `App.js` di dalam folder `src` dan ketikkan kode berikut:

```js
import React from "react";

import Provider from "./Provider";

import Person from "./Person";

const App = () => {
  return (
    <Provider>
      <Person />
    </Provider>
  );
};

export default App;
```

## Person

- Buat file baru dengan nama `Person.js` di dalam folder `src` dan ketikkan kode berikut:

```js
import React, { useContext } from "react";

import Context from "./context";

const Person = () => {
  const { state, growAYearOlder } = useContext(Context);

  return (
    <div>
      <p>Age: {state.age}</p>
      <p>Name: {state.name}</p>
      <button onClick={growAYearOlder}>🍰🍥🎂</button>
    </div>
  );
};

export default Person;
```
