# (c) Copyright 2012  Hewlett-Packard Development Company, L.P.

PRINC := "${@int(PRINC) + 1}"

DEPENDS_append_class-target = " c-ares"

EXTRA_OECONF_append_class-target = " --enable-ares"
