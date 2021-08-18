let peso = 0;
let altura = 1.63;

let imc = peso/Math.pow(altura,2);

let icmConvert = imc.toFixed(2);

if(icmConvert > 0.00 && icmConvert < 18.50){
    console.log("IMC: " + icmConvert + "\nClassificação: Magreza" + "\nGrau de obesidade: 0");
}
else if(icmConvert >= 18.50 && icmConvert <=24.99){
    console.log("IMC: " + icmConvert + "\nClassificação: Normal" + "\nGrau de obesidade: 0");
}
else if(icmConvert >= 25.00 && icmConvert <=29.99){
    console.log("IMC: " + icmConvert + "\nClassificação: Sobrepeso" + "\nGrau de obesidade: 1");
}
else if(icmConvert >= 30.00 && icmConvert <=39.99){
    console.log("IMC: " + icmConvert + "\nClassificação: Obesidade" + "\nGrau de obesidade: 2");
}
else if(icmConvert >= 40.00){
    console.log("IMC: " + icmConvert + "\nClassificação: Obesidade grave" + "\nGrau de obesidade: 3");
}
else {
    console.log("Alguma informação está inválida!");
}
