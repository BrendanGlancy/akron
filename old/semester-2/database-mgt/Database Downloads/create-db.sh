#!/bin/bash
BASEDIR=$(dirname $0)
createdb -U postgres db_management &&
psql -U postgres -d db_management -f "$BASEDIR/SQL10e_Module3_KIMTAY_SCRIPT_ORACLE.sql"
