import { createSlice } from "@reduxjs/toolkit";

export const counterSlice = createSlice({
  name: "counter",
  initialState: {
    value: 0,
  },

  reducers: {
    increment: (state) => {
      state.value += 1;
    },
    decrement: (state) => {
      state.value -= 1;
    },
    incrementByAmount: (state, action) => {
      state.value += action.payload;
    },
  },
});

export const { increment, decrement, incrementByAmount } = counterSlice.actions;

// function di bawah ini disebut thunk yang dapat digunakan untuk melakukan proses asynchronous logic, seperti melakukan request ke API atau melakukan proses yang membutuhkan waktu lama untuk selesai dijalankan.
// dapat di dispatch / dipanggil seperti action biasa
// contoh: dispatch(incrementAsync(10))
export const incrementAsync = (amount) => (dispatch) => {
  setTimeout(() => {
    dispatch(incrementByAmount(amount));
  }, 1000);
};

// function di bawah ini disebut selector yang dapat digunakan untuk mengambil data dari state
// contoh: const count = useSelector(selectCount) || const count = useSelector((state) => state.counter.value) jika tidak menggunakan yang di bawah ini
export const selectCount = (state) => state.counter.value; // state.counter.value berasal dari initialState

export default counterSlice.reducer;
