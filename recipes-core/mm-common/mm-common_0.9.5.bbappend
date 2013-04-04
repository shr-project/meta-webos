# (c) Copyright 2012  Hewlett-Packard Development Company, L.P.

PRINC := "${@int(PRINC) + 2}"

# All the original recipe does is stage a tarball and some autotools files;
# nothing compiled.
inherit allarch

# Nothing in mm-common is installed on the target => the base package should
# be empty. What's below works because ${PN}-dev is packaged ahead of ${PN}.
FILES_${PN}-dev += "${FILES_${PN}}"
