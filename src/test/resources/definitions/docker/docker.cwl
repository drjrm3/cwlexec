#!/usr/bin/env cwl-runner

cwlVersion: v1.0
class: CommandLineTool
baseCommand: node
hints:
  DockerRequirement:
    dockerPull: node:latest
inputs:
  src:
    type: File
    inputBinding:
      position: 1
outputs: []
