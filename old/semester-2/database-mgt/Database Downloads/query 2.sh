#!/bin/bash
BASEDIR=$(dirname $0)
psql -U postgres -d db_management -f "$BASEDIR/test.sql"
