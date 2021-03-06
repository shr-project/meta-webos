# (c) Copyright 2012-2013 Hewlett-Packard Development Company, L.P.

SUMMARY = "Stubbed implementation of the webOS CPU shares scripts"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

RPROVIDES_${PN} = "cpushareholder"

# corresponds to tag submissions/2
SRCREV = "57c6d94aec48214b830237b02a8f17b5a0d1f623"
PV = "2.0.1-2"
PR = "r2"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_arch_indep
inherit webos_program

WEBOS_GIT_TAG = "submissions/${WEBOS_SUBMISSION}" 
SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
