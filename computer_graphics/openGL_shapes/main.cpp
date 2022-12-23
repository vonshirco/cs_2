
/*
OpenGL (Open Graphics Library) is a cross-platform, hardware-accelerated, language-independent, industrial
standard API for producing 3D (including 2D) graphics. Modern computers have dedicated GPU (Graphics Processing Unit)
with its own memory to speed up graphics rendering.
 */

/* This code outputs a Triangle */

#include <windows.h> //to access the Win32 API functions and it makes it easier to use the in-built functionality
#include <GL/glut.h> //a library of utilities for OpenGL programs, which primarily perform system-level I/O with the host operating system.

void displayMe(void){
    glClear(GL_COLOR_BUFFER_BIT);/*glClear takes a single argument that is the bitwise OR of several values indicating which
    buffer is to be cleared.
    GL_COLOR_BUFFER_BIT. Indicates the buffers currently enabled for color writing.*/
    glBegin(GL_POLYGON); // Is used to draw a polygon having any number of sides
        glVertex3f(0.5,0.0,0.5); //The function specifies the x, y and z coordinates of the vertex
        glVertex3f(0.5,0.0,0.0);
        glVertex3f(0.0,0.5,0.0);
        glVertex3f(0.0,0.0,0.5);
    glEnd(); // The glBegin and glend functions delimit<boundaries> the vertices of a primitive or a group of like primitives.
    glFlush();
    /* Different OpenGL implementations buffer commands in several different locations, including network buffers and the
    graphics accelerator itself. The glFlush function empties all these buffers, causing all issued commands to be executed
    as quickly as they are accepted by the actual rendering engine. */
}

int main(int argc, char** argv){
    glutInit(&argc, argv); //initialize the GLUT Library and negotiate a session with the window system.
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); //set the display mode or sets the initial display mode.
    glutInitWindowSize(400, 300); //set window size
    glutInitWindowPosition(100, 100); //set the window position on the screen
    glutCreateWindow("Hello IS246 in B307!"); //opens the screen window / creates a top-level window

    //Register the callback function
    glutDisplayFunc(displayMe); //  sets the display callback for the current window.
    /* < Window Callback - A callback function, which you define in your application, that processes messages sent to a window.>
    Window callbacks indicate when to redisplay or reshape a window, when the visibility of the window changes, and when input
    is available for the window.*/

    glutMainLoop(); // enters the GLUT event processing loop.
    /* This routine should be called at most once in a GLUT program. Once called, this
    routine will never return. It will call as necessary any callbacks that have been registered. */
    return 0;
}
