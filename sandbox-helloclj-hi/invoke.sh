#!/bin/bash

aws lambda invoke \
    --invocation-type RequestResponse \
    --function-name sandbox-helloclj-hi \
    --region us-east-1 \
    --log-type Tail \
    --payload "{\"Kris\": \"Value\"}" \
    outfile.txt