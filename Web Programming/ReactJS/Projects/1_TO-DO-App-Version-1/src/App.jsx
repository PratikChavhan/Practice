import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import AppName from './components/AppName'
import AddTodo from './components/AddTodo'
import TodoItem1 from './components/TodoItem1'
import TodoItem2 from './components/TodoItem2'
import './App.css'

function App() {


  return (
    <center class='todo-container'>
      <AppName />
      <AddTodo />
      <div class="items-container">
        <TodoItem1 />
        <TodoItem2 />
      </div>
      <div class="container text-center">
      </div>
    </center>
  )
}

export default App
