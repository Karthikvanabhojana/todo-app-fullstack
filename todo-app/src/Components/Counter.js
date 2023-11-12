// import React from 'react'
// import './Counter.css'
// function Counter() {
//     return (
//         <div className="counter">
//             <button onClick={increment}>+1</button>
//             <span className="count">0</span>
//         </div>
//     )
// }
// function increment() {
//     console.log("increment");
// }

// export default Counter
import React, { Component } from 'react'
import './Counter.css'

export class Counter extends Component {
    constructor() {
        super();
this.state={
    counter : 0
}
this.increment=this.increment.bind(this)

    }

    render =() =>{
        return (
            <div className="counter">
             <button onClick={this.increment}>+{this.props.by}</button>
        

             <span className="count">{this.state.counter}</span>
         </div>
        )
    }
    increment= ()=>{
        // console.log("increment");
this.setState({
    counter: this.state.counter+this.props.by
});    
   }
// increment1(){
//     // console.log("increment");
// this.setState({
// counter: this.state.counter+1
// }); 
// }
// increment2(){
//     // console.log("increment");
// this.setState({
// counter: this.state.counter+1
// }); 
// }
// increment3(){
//     // console.log("increment");
// this.setState({
// counter: this.state.counter+1
// }); 
// }
// increment4(){
//     // console.log("increment");
// this.setState({
// counter: this.state.counter+1
// });     
//  }
}

export default Counter
