let arr = [1,2,3,4,5,6,7,8,9];

function forEachElement(arr, callback){
    for(let i=0; i<arr.length; i++){
        callback(arr[i], i);
    }
}

forEachElement(arr, (element, index)=>{
    console.log("index : "+index+", element: "+element*2);
});