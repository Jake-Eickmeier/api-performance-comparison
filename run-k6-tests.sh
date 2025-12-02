#!/bin/sh
k6 run fastapi-test.js &
k6 run springapi-test.js &
# Wait for all background processes to complete
wait