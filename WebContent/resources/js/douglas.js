function init(){
	var bt = document.getElementById('bt');
	bt.addEventListener('click',kaup,false);
}

function kaup(){
	var name=document.querySelector('#name').value;
	var height=document.getElementById('height').value;
	var weight=document.getElementById('weight').value;
	console.log('name'+name);
	console.log('height'+height);
	console.log('weight'+weight);
	var result = '';
	var kaup = weight / (height / 100) / (height / 100);
	if (kaup < 18.5) {
		result = "저체중";
	} else if (kaup < 22.9 && kaup > 18.5) {
		result = "정상";
	} else if (kaup < 24.9 && kaup > 23.0) {
		result = "위험체중";
	} else if (kaup < 29.9 && kaup > 25.0) {
		result = "비만1단계";
	} else if (kaup < 40 && kaup > 30.0) {
		result = "비만2단계";
	} else if (kaup >= 40) {
		result = "비만3단계";
	}
	document.getElementById('result').innerHTML=name+'의 카우푸결과'+result;
	/*return name + "의 BMI지수는 " + Double.parseDouble(String.format("%.2f", kaup)) + "이고, " + result + "이다";*/
}