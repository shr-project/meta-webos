# (c) Copyright 2013 Hewlett-Packard Development Company, L.P.

PRINC := "${@int(PRINC) + 1}"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
