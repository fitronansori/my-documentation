import { ADD_TODO, DELETE_TODO } from "../action/TodoAction";

export const initialState = {
  todos: [
    { id: 1, text: "Learn about reducers", complete: false },
    { id: 2, text: "Learn about actions", complete: false },
  ],
};

export function todoReducer(state = initialState, action) {
  switch (action.type) {
    case ADD_TODO:
      return {
        ...state,
        todos: [...state.todos, action.payload],
      };

    case DELETE_TODO:
      return {
        ...state,
        todos: state.todos.filter((todo) => todo.id !== action.payload),
      };

    default:
      return state;
  }
}

// export default todoReducer;
