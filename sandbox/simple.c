#include <unistd.h>
#include <stdio.h>
#include <string.h>

int k = 42;

int main( int argc, char** argv ) {
  char *message = "fourty-two";

  int i;

  write( STDOUT_FILENO, message, strlen( message ) );

  i = k;

  return 0;
}
