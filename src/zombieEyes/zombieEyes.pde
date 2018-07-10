void setup() {
  size(800,800);
  PImage face=loadImage("face.jpg");
  face.resize(800,800);
image(face,0,0);
}
void draw() {
  fill(mouseX,mouseY,0);
  ellipse(268,404,30,30);
  ellipse(540,406,30,30);
  fill(#000000);
  ellipse(268,404,10,10);
  fill(#000000);
  ellipse(540,406,10,10);

}