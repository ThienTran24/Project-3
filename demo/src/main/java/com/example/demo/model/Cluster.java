package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_cluster")
public class Cluster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clusterId;
	
	@Column(name = "cluster")
	private String cluster;
	
	@Column(name = "cluster_name")
	private String clusterName;

	public Cluster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getClusterId() {
		return clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
}

