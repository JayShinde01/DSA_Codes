function reverse(name) {
    let ans ="";
    for(let i = name.length-1; i>=0;i--){
        ans += name[i];
    }
    return ans;
}

console.log(reverse("jay"));
