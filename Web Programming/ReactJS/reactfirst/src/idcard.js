export default function IdCard(props) {
    // let name = "Pratik"
    // let dob = "1997-06-14"
    // let phone = "6154841512"
    let{name, dob, phone} = props.obj    // object destructuring
    let styleobj = {border:"3px groove red", width:"300px", color:"white", backgroundColor:"Black"}
    return (
        <div style={styleobj}>
            <p>Name: {name}</p>
            <p>DOB: {dob}</p>
            <p>phone: {phone}</p>
        </div>
    )
}