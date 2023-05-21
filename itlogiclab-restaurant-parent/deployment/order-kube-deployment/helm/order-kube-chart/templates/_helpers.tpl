{{/*
    Return the proper GIT image name
*/}}
{{- define "order.cloneStaticSiteFromGit.image" -}} 
{{ include "images.image" (dict "imageRoot" .Values.cloneStaticSiteFromGit.image "global" .Values.global) }}
{{- end -}}