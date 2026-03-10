#!/bin/bash

echo "Monitor garbage collection details and see amount of memory reclaimed, pause time, type of GC used"

java -XX:+PrintGCDetails Main >> gc_details.log