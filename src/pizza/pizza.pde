void setup(){
  size(800,800);
  fill(#E3CF95);
  ellipse(400,400,400,400);
  fill(#FA300D);
  ellipse(400,400,350,350);
  fill(#FFFED6);
  ellipse(400,400,300,300);
}
void draw(){
  PImage pepperoni=
  loadImage("pepperoni.ppm.gif");
  pepperoni.resize(25,25);

  if (mousePressed){
   image(pepperoni,mouseX,mouseY);
  }
}