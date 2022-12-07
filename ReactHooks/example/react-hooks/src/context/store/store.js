import { createContext } from "react";
import { todoReducer } from "../reducer/todosReducer";

export const todos = createContext(todoReducer);

export const Provider = todos.Provider;
export const Consumer = todos.Consumer;
