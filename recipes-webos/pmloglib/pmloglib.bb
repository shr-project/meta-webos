# (c) Copyright 2012  Hewlett-Packard Development Company, L.P. 

SUMMARY = "Open webOS logging library"
SECTION = "webos/libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

RDEPENDS_${PN} = "pmlogconf"

# corresponds to tag submissions/24
SRCREV = "358f71d03be4193815e9d57504b541f16fca0ef4"
PV = "2.1.0-24"
PR = "r3"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_library

WEBOS_GIT_TAG = "submissions/${WEBOS_SUBMISSION}"
SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
