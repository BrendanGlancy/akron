// store the result of an async function in a variable that can be used later/
import fetch from 'node-fetch';
// to access the result of the async function
const result = async function() {
    const response = await fetch('https://jsonplaceholder.typicode.com/todos/1');
    const data = await response.json();
    return data;
}();

// call the function
result.then(data => console.log(data));


result.catch(err => console.log(err));
