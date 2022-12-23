/*
 * GLUT Shapes Demo
 *
 * Written by Von 2022*
 * GLUT Line Demo
 *
 */

#include<windows.h>
#include<gl/glut.h>

void init(void){
	glClearColor(1.0,1.0,1.0,0.0);
	glLineWidth(2.0);
	glMatrixMode(GL_PROJECTION);
	gluOrtho2D(0.0,300.0,0.0,300.0);
}

void Line(void){
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glColor3f(1.0,0.0,0.0);
	glBegin(GL_LINES);
		glVertex2i(20,20);
		glVertex2i(150,150);
	glEnd();
	glFlush();
}

int main(int argc, char **argv){

	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(400,400);
	glutCreateWindow("Line Tutorial");

	init();
	glutDisplayFunc(Line);

	glutMainLoop();
}
