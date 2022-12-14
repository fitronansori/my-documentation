import { useState, useCallback } from "react";
import Todos from "./components/Todos";

const App = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState([]);

  const increment = () => {
    setCount((c) => c + 1);
  };
  const addTodo = useCallback(() => {
    setTodos((t) => [...t, "New Todo"]);
  }, [todos]);

  return (
    <>
      <Todos todos={todos} addTodo={addTodo} />
      <hr />
      <div>
        Count: {count}
        <button onClick={increment}>+</button>
      </div>
    </>
  );
};

export default App;
// import React, { useState, useReducer } from "react";
// import TodoInput from "./components/TodoInput";
// import TodoList from "./components/TodoList";
// import { todoReducer, initialState } from "./context/reducer/todosReducer";

// import { Provider, todos } from "./context/store/store";

// const App = () => {
//   const [state, dispatch] = useReducer(todoReducer, initialState);
//   const [todo, setTodoText] = useState("");
//   console.log(state);

//   const handleSubmit = (e) => {
//     e.preventDefault();
//     dispatch({ type: "ADD_TODO", payload: todo });
//     setTodoText("");
//   };

//   return (
//     <Provider value={todos}>
//       <div>
//         <h1>Todo App</h1>
//         <TodoInput
//           handleSubmit={handleSubmit}
//           todos={todo}
//           setTodoText={setTodoText}
//         />
//         <TodoList todos={state.todos} />
//       </div>
//     </Provider>
//   );
// };

// export default App;
