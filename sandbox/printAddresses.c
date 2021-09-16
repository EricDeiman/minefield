#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int i;
int j = 2;

extern int _end;
extern int _etext;
extern int _edata;
extern int __bss_start;

extern char **environ;

int main( int argc, char **argv ) {
  int k;
  void* m = malloc(1);
  void* s = sbrk(0);

  printf( "Address of main       = %016x\n", (unsigned int)main );
  printf( "Address of _etext     = %016x\n", (unsigned int)&_etext );
  printf( "Address of j          = %016x\n", (unsigned int)&j );
  printf( "Address of _edata     = %016x\n", (unsigned int)&_edata );
  printf( "Address of _bss_start = %016x\n", (unsigned int)&__bss_start );
  printf( "Address of i          = %016x\n", (unsigned int)&i );
  printf( "Address of _end       = %016x\n", (unsigned int)&_end );
  printf( "Address of k          = %016x\n", (unsigned int)&k );
  printf( "Address of argc       = %016x\n", (unsigned int)&argc );
  printf( "Address pointed m     = %016x\n", (unsigned int)m);
  printf( "Address pointed s     = %016x\n", (unsigned int)s);
  printf( "Address of argument   = %016x\n", (unsigned int)argv[0] );
  printf( "Address of environ    = %016x\n", (unsigned int)environ );

  return 0;
}
