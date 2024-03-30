$(document).ready(function(){
    $('#hideLinear').hide();

    $('#hideBinary').hide();

    $('#showlinear').on('click' , ()=>{
        $('#hideBinary').hide();
         $('#hideLinear').show();
    
    })

    $('#showBinary').on('click' , ()=>{
        $('#hideLinear').hide();
        $('#hideBinary').show();
    })

    let nums = [];

    $('#linearAdd').click(function(){
        let linearInputValue = parseInt($('#linearInput').val());
        nums.push(linearInputValue);
        $('#linearInput').val('');
        $('#linearArray').text('[' + nums.join(', ') + ']');
    })

    $('#linearSearch').on('click' , ()=>{
        linearSearch(nums);
    });

    $('#binaryAdd').click(function(){
        let inputValue = parseInt($('#binaryInput').val());
        nums.push(inputValue);
        $('#binaryInput').val('');
        $('#binaryArray').text('[' + nums.join(', ') + ']'); 
    });

    $('#binarySearch').click(function(){
        binarySearch(nums); 
    });


   
});

function binarySearch(nums) {
    let key = parseInt($('#binaryKey').val());

    if (isNaN(key)) {
        alert('Please enter a valid number to search.');
        return false;
    }

    let start = 0, end = nums.length - 1;

    while (start <= end) {
        let mid = Math.floor((start + end) / 2);

        if (nums[mid] === key) {


           $('#binaryResult').text(`The number ${key} is at index: ${mid}`)
            return true;
        } else if (nums[mid] < key) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    alert(`The number ${key} is not found in the array.`);
    return false;
}


function linearSearch(nums){
    let key = $('#linearKey').val();

    for(let i=0; i<nums.length; i++){
        if(nums[i] == key){
            $('#linearResult').text(`The number ${key} is at index: ${i}`)
        }
    }
}