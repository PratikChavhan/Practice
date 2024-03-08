import React, {useRef} from 'react';
import { useDispatch } from 'react-redux';
import { setMessage } from '../redux/slices/messageSlice';

export default function Child1() {
    let inputRef = useRef(null);
    const dispatch = useDispatch();

    function handler(event){
        event.preventDefault();
        const inputTextValue = inputRef.current.value;
        dispatch(setMessage(inputTextValue));
    }

    return (
        <div>
            <form onSubmit={handler}>
                <input type="text" ref={inputRef}/>
                <input type="submit" onClick={handler} />
            </form>
        </div>
    )
}
