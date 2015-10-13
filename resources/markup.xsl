<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:preserve-space elements="br" />
	<xsl:output method="xml" omit-xml-declaration="yes" encoding="UTF-8" />

	<xsl:template match="/">
		<xsl:apply-templates/>
	</xsl:template>
	
	<xsl:template match="text()"><xsl:value-of select="translate(., '&#x20;&#x9;&#xD;&#xA;', ' ')"/></xsl:template>
	
	<xsl:template match="span"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>

	<xsl:template match="b"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="big"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="i"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="s"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="sub"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="sup"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="small"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="tt"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="u"><xsl:copy><xsl:apply-templates/></xsl:copy></xsl:template>
	
	<xsl:template match="a"><span underline="low" foreground="#0000EE"><xsl:apply-templates/></span></xsl:template>
	
</xsl:stylesheet>