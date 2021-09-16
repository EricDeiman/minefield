  .section .rodata
.message:
  .ascii "fourty-two\n"
.message_len:
  .long .-.message

  .text
  .globl main

main:
  movq $1, %rdi
  leaq .message(%rip), %rsi
  movl .message_len(%rip), %edx
  movq $1, %rax
  syscall
  ret
