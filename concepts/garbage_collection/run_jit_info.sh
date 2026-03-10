#!/bin/bash

echo "See information about JIT compiler"  
java -XX:+PrintCompilation Main >> jit_output.log