import { configureStore } from "@reduxjs/toolkit";
import messageReducer from "./slices/messageSlice";

export default configureStore({
    reducer: {
        messageReducer  // key: value same name so only key
    }
})