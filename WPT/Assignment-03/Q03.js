function fetchData(url, callback){
    console.log(`fetching data from ${url}`);

    setTimeout(()=>{
        let response = `response from ${url}`;
        callback(response);
    },3000);
}

fetchData("https://www.google.com", (response)=>{
    console.log(`Received ${response}`);
})