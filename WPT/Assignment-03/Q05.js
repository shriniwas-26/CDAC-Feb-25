function fetchData(url, callback){
    console.log(`fetching data from ${url}`);
    setTimeout(()=>{
        let error = false;
        if(error){
            let errMsg = `error fetching data from ${url}`;
            callback(errMsg,null,null);
        }else{
            let response = `response from ${url}`;
            callback(null,response,processData);
        }
    },3000);
}

fetchData('https://www.google.com', (errMsg,response,callback2)=>{
    if(errMsg){
        console.log(`Error: ${errMsg}`);
    }else{
        console.log(`Processing ${response}`);
        setTimeout(()=>{
            callback2(`${response}`);
        },3000);
        
    }
});

function processData(response){
    console.log(`Processed response: ${response}`);
}