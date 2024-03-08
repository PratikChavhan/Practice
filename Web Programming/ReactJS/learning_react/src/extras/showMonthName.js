import { useState } from 'react'

export default function ShowMonthName() {
    let [month, setmonth] = useState("")
    function handler(event) {
            console.log(event.target.value)
            let selectedMonth = parseInt(event.target.value)
            switch(selectedMonth){
            case 1 : setmonth("January");break;
            case 2 : setmonth("February");break;
            case 3 : setmonth("March");break;
            case 4 : setmonth("April");break;
            case 5 : setmonth("May");break;
            case 6 : setmonth("June");break;
            case 7 : setmonth("July");break;
            case 8 : setmonth("August");break;
            case 9 : setmonth("September");break;
            case 10 : setmonth("October");break;
            case 11 : setmonth("November");break;
            case 12 : setmonth("December");break;
            }            
    }
    return (
        <>
            <select onChange={handler}>
                <option selected='selected'>select Month</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
            </select>

            <p>{month}</p>
        </>
    )
}