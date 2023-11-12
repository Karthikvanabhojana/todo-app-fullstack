import logo from './logo.svg';
import './App.css';
import FirstComponent from './Components/Learning/FirstComponent';
import Counter from './Components/Counter';
function App() {
  return (
    <div className="App">

      <Counter by={1}/>
      <Counter by={5}/>
      <Counter by={10}/>
      {/* <FirstComponent /> */}

    </div>
  );
}

export default App;
