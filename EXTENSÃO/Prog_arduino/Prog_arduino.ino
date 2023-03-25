#include <Ultrasonic.h>
#define ledVermelho 2
#define ledVerde 3
#define ledAzul 6
#define pino_trigger 4
#define pino_echo 5

Ultrasonic ultrasonic(pino_trigger, pino_echo);




void setup() {
  Serial.begin(9600);
  pinMode(ledVermelho, OUTPUT);
  pinMode(ledVerde, OUTPUT);
  pinMode(ledAzul, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
   float cmMsec, inMsec;
  long microsec = ultrasonic.timing();
  cmMsec = ultrasonic.convert(microsec, Ultrasonic::CM);
  inMsec = ultrasonic.convert(microsec, Ultrasonic::IN);
  //Exibe informacoes no serial monitor
  Serial.print("Distancia em cm: ");
  Serial.print(cmMsec);
  Serial.print(" - Distancia em polegadas: ");
  Serial.println(inMsec);
  delay(1000);

  if(cmMsec < 10 ) {
    digitalWrite(ledVermelho,HIGH);
    digitalWrite(ledVerde, LOW);
    digitalWrite(ledAzul, LOW);
  }

  else if(cmMsec > 10 && cmMsec < 20) {
    digitalWrite(ledVermelho,LOW);
    digitalWrite(ledVerde, LOW);
    digitalWrite(ledAzul, HIGH);
  }

  else {
    digitalWrite(ledVerde, HIGH);
    digitalWrite(ledVermelho,LOW);
    digitalWrite(ledAzul, LOW);
  };

  
}
