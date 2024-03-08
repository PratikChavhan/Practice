import React from "react"
import { useSelector } from "react-redux"

export default function Child2() {
    const message = useSelector(state => state.messageReducer.message)
    return (
        <div>The data from Child1 is: {message}</div>
    )
}

