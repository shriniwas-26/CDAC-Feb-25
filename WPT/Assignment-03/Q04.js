function fetchData(url, callback){
    console.log(`fetching data from ${url}`);
    setTimeout(()=>{
        let error = true;
        if(error){
            let errMsg = `error fetching data from ${url}`;
            callback(errMsg,null);
        }else{
            let response = `response from ${url}`;
            callback(null,response);
        }
    },3000);
}

fetchData('https://www.google.com', (errMsg,response)=>{
    if(errMsg){
        console.log(`Error: ${errMsg}`);
    }else{
        console.log(`Received: ${response}`);
    }
});