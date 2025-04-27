function removeItem(){
    var selectOpt = document.getElementById("selectOpt");
    var sindex = selectOpt.selectedIndex;

    if(sindex !== -1){
        selectOpt.remove(sindex);
    }else{
        alert("Dropdown doesnt have any item");
    }
}