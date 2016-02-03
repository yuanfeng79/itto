package com.whoisyuan.itto;

import java.util.ArrayList;
import java.util.HashMap;

public class DATA {
    public enum ITTO {
        ENTERPRISE_ENVIRONMENTAL_FACTORS,                   // 事业环境因素
        ORGANIZATIONAL_PROCESS_ASSETS,                      // 组织过程资产
        PROJECT_MANAGEMENT_PLAN,                            // 项目管理计划
        SCOPE_MANAGEMENT_PLAN,                              // 范围管理计划
        REQUIREMENTS_MANAGEMENT_PLAN,                       // 需求管理计划
        SCHEDULE_MANAGEMENT_PLAN,                           // 进度管理计划
        COST_MANAGEMENT_PLAN,                               // 成本管理计划
        QUALITY_MANAGEMENT_PLAN,                            // 质量管理计划
        PROCESS_IMPROVEMENT_PLAN,                           // 过程改进计划
        HUMAN_RESOURCE_MANAGEMENT_PLAN,                     // 人力资源管理计划
        COMMUNICATIONS_MANAGEMENT_PLAN,                     // 沟通管理计划
        RISK_MANAGEMENT_PLAN,                               // 风险管理计划
        PROCUREMENT_MANAGEMENT_PLAN,                        // 采购管理计划
        STAKEHOLDER_MANAGEMENT_PLAN,                        // 干系人管理计划
        SCOPE_BASELINE,                                     // 范围基准
        PROJECT_SCOPE_STATEMENT,                            // 项目范围说明书
        RISK_REGISTER,                                      // 风险登记册
        WORK_PERFORMANCE_DATA,                              // 工作绩效数据
        PROJECT_CHARTER,                                    // 项目章程
        STAKEHOLDER_REGISTER,                               // 干系人登记册
        REQUIREMENT_DOCUMENTATION,                          // 需求文件
        PROCUREMENT_DOCUMENTS,                              // 采购文件
        PROJECT_DOCUMENTS,                                  // 项目文件
        RESOURCE_CALENDAR,                                  // 资源日历
        WORK_PERFORMANCE_REPORTS,                           // 工作绩效报告
        ACTIVITY_LIST,                                      // 活动清单
        ACTIVITY_ATTRIBUTES,                                // 活动属性
        ACTIVITY_RESOURCE_REQUIREMENTS,                     // 活动资源需求
        PROJECT_SCHEDULE,                                   // 项目进度计划
        ACTIVITY_COST_ESTIMATES,                            // 活动成本估算
        AGREEMENTS,                                         // 协议
        PROJECT_STAFF_ASSIGNMENTS,                          // 项目人员分派
        ISSUE_LOG,                                          // 问题日志
        APPROVED_CHANGE_REQUESTS,                           // 批准的变更请求
        REQUIREMENTS_TRACEABILITY_MATRIX,                   // 需求跟踪矩阵
        RESOURCE_BREAKDOWN_STRUCTURE,                       // 资源分解结构
        ACTIVITY_DURATION_ESTIMATES,                        // 活动持续时间估算
        QUALITY_METRICS,                                    // 质量测量指标
        PROJECT_STATEMENT_OF_WORK,                          // 项目工作说明书
        BUSINESS_CASE,                                      // 商业论证
        PROJECT_SCHEDULE_NETWORK_DIAGRAM,                   // 项目进度网络图
        MILESTONE_LIST,                                     // 里程碑清单
        PROJECT_CALENDAR,                                   // 项目日历
        SCHEDULE_DATA,                                      // 进度数据
        SCHEDULE_FORECASTS,                                 // 进度预测
        BASIS_OF_ESTIMATES,                                 // 估算依据
        COST_FORECASTS,                                     // 成本预测
        PROJECT_FUNDING_REQUIREMENTS,                       // 项目资金需求
        TEAM_PERFORMANCED_ASSESSMENTS,                      // 团队绩效评价
        PROJECT_COMMUNICATIONS,                             // 项目沟通
        QUALITY_CHECKLISTS,                                 // 质量核对单
        QUALITY_CONTROL_MEASUREMENTS,                       // 质量控制测量结果
        DELIVERABLES,                                       // 可交付成果
        VERIFIED_DELIVERABLES,                              // 核实的可交付成果
        ACCEPTED_DELIVERABLES,                              // 验收的可交付成果
        WORK_PERFORMANCE_INFORMATION,                       // 工作绩效信息
        CHANGE_LOG,                                         // 变更日志
        CHANGE_REQUESTS,                                    // 变更请求
        VALIDATED_CHANGES,                                  // 确认的变更
        MAKE_OR_BUY_DECISIONS,                              // 自制或外购决策
        PROCUREMENT_STATEMENT_OF_WORK,                      // 采购工作说明书
        SELLER_PROPOSALS,                                   // 卖方建议书
        SOURCE_SELECTION_CRITERIA,                          // 供方选择标准
        PROJECT_MANAGEMENT_PLAN_UPDATES,                    // 项目管理计划更新
        PROJECT_DOCUMENTS_UPDATES,                          // 项目文件更新
        ORGANIZATIONAL_PROCESS_ASSETS_UPDATES,              // 组织过程资产更新
        COST_BASELINE,                                      // 成本基准
        SCHEDULE_BASELINE,                                  // 进度基准
        SELECTED_SELLERS,                                   // 选定的卖方
        ENTERPRISE_ENVIRONMENTAL_FACTORS_UPDATES,           // 事业环境因素更新
        CLOSED_PROCUREMENTS,                                // 结束的采购
        FINAL_PRODUCT_SERVICE_OR_RESULT_TRANSITION,         // 最终产品、服务或成果移交
        OUTPUTS_FROM_OTHER_PROCESSES,                       // 其他过程的输出

        EXPERT_JUDGEMENT,                                   // 专家判断
        MEETINGS,                                           // 会议
        ANALYTICAL_TECHNIQUES,                              // 分析技术
        RESERVE_ANALYSIS,                                   // 储备分析
        GROUP_DECISION_MAKING_TECHNIQUES,                   // 群体决策技术
        PROJECT_MANAGEMENT_SOFTWARE,                        // 项目管理软件
        COMMUNICATION_METHODS,                              // 沟通方法
        INFORMATION_MANAGEMENT_SYSTEMS,                     // 信息管理系统
        INTERPERSONAL_SKILLS,                               // 人际关系技能
        LEADS_AND_LAGS,                                     // 提前量与滞后量
        ANALOGOUS_ESTIMATING,                               // 类比估算
        BENCHMARKING,                                       // 标杆对照
        BOTTOM_UP_ESTIMATING,                               // 自下而上估算
        COMMUNICATION_MODELS,                               // 沟通模型
        COMMUNICATION_TECHNOLOGY,                           // 沟通技术
        COST_OF_QUALITY,                                    // 质量成本
        DECOMPOSITION,                                      // 分解
        FACILIATED_WORKSHOPS,                               // 引导式研讨会
        FACILITATION_TECHNIQUES,                            // 引导技术
        INSPECTION,                                         // 检查
        MODELING_TECHNIQUES,                                // 建模技术
        PARAMETRIC_ESTIMATING,                              // 参数估算
        PERFORMANCE_REPORTING,                              // 报告绩效
        PERFORMANCE_REVIEWS,                                // 绩效审查
        PROCUREMENT_NEGOTIATIONS,                           // 采购谈判
        PROJECT_MANAGEMENT_INFORMATION_SYSTEM,              // 项目管理信息系统
        RECORDS_MANAGEMENT_SYSTEM,                          // 记录管理系统
        RESOURCE_OPTIMIZATION_TECHNIQUES,                   // 资源优化技术
        SCHEDULE_COMPRESSING,                               // 进度压缩
        SCHEDULING_TOOL,                                    // 进度计划编制工具
        SEVEN_BASIC_QUALITY_TOOLS,                          // 七种基本质量工具
        STATISTICAL_SAMPLING,                               // 统计抽样
        THREE_POINT_ESTIMATING,                             // 三点估算
        STAKEHOLDER_ANALYSIS,                               // 干系人分析
        CONTEXT_DIAGRAMS,                                   // 系统交互图
        DOCUMENT_ANALYSIS,                                  // 文件分析
        FOCUS_GROUPS,                                       // 焦点小组
        GROUP_CREATIVITY_TECHNIQUES,                        // 群体创新技术
        INTERVIEWS,                                         // 访谈
        OBSERVATIONS,                                       // 观察
        PROTOTYPES,                                         // 原型法
        QUESTIONNAIRES_AND_SURVEYS,                         // 问卷调查
        ALTERNATIVES_GENERATION,                            // 备选方案生成
        PRODUCT_ANALYSIS,                                   // 产品分析
        ROLLING_WAVE_PLANNING,                              // 滚动式规划
        DEPENDENCY_DETERMINATION,                           // 确定依赖关系
        PRECEDENCE_DIAGRAMMING_METHOD,                      // 紧前关系绘图法
        ALTERNATIVE_ANALYSIS,                               // 备选方案分析
        PUBLISHED_ESTIMATING_DATA,                          // 发布的估算数据
        CRITICAL_PATH_METHOD,                               // 关键链法
        CRITICAL_CHAIN_METHOD,                              // 关键路径法
        SCHEDULE_NETWORK_ANALYSIS,                          // 进度网络分析
        VENDOR_BID_ANALYSIS,                                // 卖方投标分析
        COST_AGGREGATION,                                   // 成本汇总
        FUNDING_LIMIT_RECONCILIATION,                       // 资金限制平衡
        HISTORICAL_RELATIONSHIPS,                           // 历史关系
        ADDITIONAL_QUALITY_PLANNING,                        // 其他质量管理工具
        COST_BENEFIT_ANALYSIS,                              // 成本效益分析
        DESIGN_OF_EXPERIMENTS,                              // 实验设计
        NETWORKING,                                         // 人际交往
        ORGANIZATION_CHARTS_AND_POSITION_DESCRIPTIONS,      // 组织图和职位描述
        ORGANIZATION_THEORY,                                // 组织理论
        COMMUNICATION_REQUIREMENTS_ANALYSIS,                // 沟通需求分析
        ASSUMPTIONS_ANALYSIS,                               // 假设分析
        CHECKLIST_ANALYSIS,                                 // 核对单分析
        DIAGRAMMING_TECHNIQUES,                             // 图解技术
        DOCUMENTATION_REVIEWS,                              // 文档审查
        INFORMATION_GATHERING_TECHNIQUES,                   // 信息收集技术
        SWOT_ANALYSIS,                                      // SWOT分析
        PROBABILITY_AND_IMPACT_MATRIX,                      // 概率和影响矩阵
        RISK_CATEGORIZATION,                                // 风险分类
        RISK_DATA_QUALITY_ASSESSMENT,                       // 风险数据质量评估
        RISK_PROBABILITY_AND_IMPACT_ASSESSMENT,             // 风险概率和影响评估
        RISK_URGENCY_ASSESSMENT,                            // 风险紧迫性评估
        DATA_GATHERING_AND_REPRESENTATION_TECHNIQUES,       // 数据收集和展示技术
        QUANTITATIVE_RISK_ANALYSIS_AND_MODELING_TECHNIQUES, // 定量风险分析与建模技术
        CONTINGENT_RESPONSE_STRATEGIES,                     // 应急应对策略
        STRATEGIES_FOR_NEGATIVE_RISKS_OR_THREATS,           // 消极风险或威胁的应对策略
        STRATEGIES_FOR_POSITIVE_RISKS_OR_OPPORTUNITIES,     // 积极风险或机会的应对策略
        MAKE_OR_BUY_ANALYSIS,                               // 自制或外购分析
        MARKET_RESEARCH,                                    // 市场调研
        PROCESS_ANALYSIS,                                   // 过程分析
        QUALITY_AUDITS,                                     // 质量审计
        QUALITY_MANAGEMENT_AND_CONTROL_TOOLS,               // 质量管理和控制工具
        ACQUISITION,                                        // 招募
        MULTI_CRITERIA_DECISION_ANALYSIS,                   // 多标准决策分析
        NEGOTIATION,                                        // 谈判
        PRE_ASSIGNMENT,                                     // 预分派
        VIRTUAL_TEAMS,                                      // 虚拟团队
        COLOCATION,                                         // 集中办公
        GROUND_RULES,                                       // 基本规则
        PERSONNEL_ASSESSMENT_TOOLS,                         // 人事测评工具
        RECOGNITION_AND_REWARDS,                            // 认可与奖励
        TEAM_BUILDING_ACTIVITIES,                           // 团队建设活动
        TRAINING,                                           // 培训
        CONFLICT_MANAGEMENT,                                // 冲突管理
        OBSERVATION_AND_CONVERSATION,                       // 观察和交谈
        PROJECT_PERFORMANCE_APPRAISALS,                     // 项目绩效评估
        ADVERTISING,                                        // 广告
        BIDDER_CONFERENCE,                                  // 投标人会议
        INDEPENDENT_ESTIMATES,                              // 独立估算
        PROPOSAL_EVALUATION_TECHNIQUES,                     // 建议书评审技术
        MANAGEMENT_SKILLS,                                  // 管理技能
        VARIANCE_ANALYSIS,                                  // 偏差分析
        EARNED_VALUE_MANAGEMENT,                            // 挣值管理
        FORECASTING,                                        // 预测
        TO_COMPLETE_PERFORMANCE_INDEX,                      // 完工尚需绩效指数
        APPROVED_CHANGE_REQUESTS_REVIEW,                    // 审计已批准的变更请求
        RISK_AUDITS,                                        // 风险审计
        RISK_REASSESSMENT,                                  // 风险再评估
        TECHNICAL_PERFORMANCE_MEASUREMENT,                  // 技术绩效测量
        VARIANCE_AND_TREND_ANALYSIS,                        // 偏差与趋势分析
        CLAIM_ADMINISTRATION,                               // 索赔管理
        CONTRACT_CHANGE_CONTROL_SYSTEM,                     // 合同变更控制系统
        INSPECTIONS_AND_AUDITS,                             // 检查与审计
        PAYMENT_SYSTEM,                                     // 支付系统
        PROCUREMENT_PERFORMANCE_REVIEWS,                    // 采购绩效审查
        CHANGE_CONTROL_TOOLS,                               // 变更控制工具
        PROCUREMENT_AUDITS,                                 // 采购审计
    }

    public static HashMap<ITTO, Integer> ittoMap = new HashMap<ITTO, Integer>() {
        {
            put(ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS,          R.string.enterprise_environmental_factors          );
            put(ITTO.ORGANIZATIONAL_PROCESS_ASSETS,             R.string.organizational_process_assets             );
            put(ITTO.PROJECT_MANAGEMENT_PLAN,                   R.string.project_management_plan                   );
            put(ITTO.SCOPE_MANAGEMENT_PLAN,                     R.string.scope_management_plan                     );
            put(ITTO.REQUIREMENTS_MANAGEMENT_PLAN,              R.string.requirements_management_plan              );
            put(ITTO.SCHEDULE_MANAGEMENT_PLAN,                  R.string.schedule_management_plan                  );
            put(ITTO.COST_MANAGEMENT_PLAN,                      R.string.cost_management_plan                      );
            put(ITTO.QUALITY_MANAGEMENT_PLAN,                   R.string.quality_management_plan                   );
            put(ITTO.PROCESS_IMPROVEMENT_PLAN,                  R.string.process_improvement_plan                  );
            put(ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN,            R.string.human_resource_management_plan            );
            put(ITTO.COMMUNICATIONS_MANAGEMENT_PLAN,            R.string.communications_management_plan            );
            put(ITTO.RISK_MANAGEMENT_PLAN,                      R.string.risk_management_plan                      );
            put(ITTO.PROCUREMENT_MANAGEMENT_PLAN,               R.string.procurement_management_plan               );
            put(ITTO.STAKEHOLDER_MANAGEMENT_PLAN,               R.string.stakeholder_management_plan               );
            put(ITTO.SCOPE_BASELINE,                            R.string.scope_baseline                            );
            put(ITTO.PROJECT_SCOPE_STATEMENT,                   R.string.project_scope_statement                   );
            put(ITTO.RISK_REGISTER,                             R.string.risk_register                             );
            put(ITTO.WORK_PERFORMANCE_DATA,                     R.string.work_performance_data                     );
            put(ITTO.PROJECT_CHARTER,                           R.string.project_charter                           );
            put(ITTO.STAKEHOLDER_REGISTER,                      R.string.stakeholder_register                      );
            put(ITTO.REQUIREMENT_DOCUMENTATION,                 R.string.requirement_documentation                 );
            put(ITTO.PROCUREMENT_DOCUMENTS,                     R.string.procurement_documents                     );
            put(ITTO.PROJECT_DOCUMENTS,                         R.string.project_documents                         );
            put(ITTO.RESOURCE_CALENDAR,                         R.string.resource_calendar                         );
            put(ITTO.WORK_PERFORMANCE_REPORTS,                  R.string.work_performance_reports                  );
            put(ITTO.ACTIVITY_LIST,                             R.string.activity_list                             );
            put(ITTO.ACTIVITY_ATTRIBUTES,                       R.string.activity_attributes                       );
            put(ITTO.ACTIVITY_RESOURCE_REQUIREMENTS,            R.string.activity_resource_requirements            );
            put(ITTO.PROJECT_SCHEDULE,                          R.string.project_schedule                          );
            put(ITTO.ACTIVITY_COST_ESTIMATES,                   R.string.activity_cost_estimates                   );
            put(ITTO.AGREEMENTS,                                R.string.agreements                                );
            put(ITTO.PROJECT_STAFF_ASSIGNMENTS,                 R.string.project_staff_assignments                 );
            put(ITTO.ISSUE_LOG,                                 R.string.issue_log                                 );
            put(ITTO.APPROVED_CHANGE_REQUESTS,                  R.string.approved_change_requests                  );
            put(ITTO.REQUIREMENTS_TRACEABILITY_MATRIX,          R.string.requirements_traceability_matrix          );
            put(ITTO.RESOURCE_BREAKDOWN_STRUCTURE,              R.string.resource_breakdown_structure              );
            put(ITTO.ACTIVITY_DURATION_ESTIMATES,               R.string.activity_duration_estimates               );
            put(ITTO.QUALITY_METRICS,                           R.string.quality_metrics                           );
            put(ITTO.PROJECT_STATEMENT_OF_WORK,                 R.string.project_statement_of_work                 );
            put(ITTO.BUSINESS_CASE,                             R.string.business_case                             );
            put(ITTO.PROJECT_SCHEDULE_NETWORK_DIAGRAM,          R.string.project_schedule_network_diagram          );
            put(ITTO.MILESTONE_LIST,                            R.string.milestone_list                            );
            put(ITTO.PROJECT_CALENDAR,                          R.string.project_calendar                          );
            put(ITTO.SCHEDULE_DATA,                             R.string.schedule_data                             );
            put(ITTO.SCHEDULE_FORECASTS,                        R.string.schedule_forecasts                        );
            put(ITTO.BASIS_OF_ESTIMATES,                        R.string.basis_of_estimates                        );
            put(ITTO.COST_FORECASTS,                            R.string.cost_forecasts                            );
            put(ITTO.PROJECT_FUNDING_REQUIREMENTS,              R.string.project_funding_requirements              );
            put(ITTO.TEAM_PERFORMANCED_ASSESSMENTS,             R.string.team_performanced_assessments             );
            put(ITTO.PROJECT_COMMUNICATIONS,                    R.string.project_communications                    );
            put(ITTO.QUALITY_CHECKLISTS,                        R.string.quality_checklists                        );
            put(ITTO.QUALITY_CONTROL_MEASUREMENTS,              R.string.quality_control_measurements              );
            put(ITTO.DELIVERABLES,                              R.string.deliverables                              );
            put(ITTO.VERIFIED_DELIVERABLES,                     R.string.verified_deliverables                     );
            put(ITTO.ACCEPTED_DELIVERABLES,                     R.string.accepted_deliverables                     );
            put(ITTO.WORK_PERFORMANCE_INFORMATION,              R.string.work_performance_information              );
            put(ITTO.CHANGE_LOG,                                R.string.change_log                                );
            put(ITTO.CHANGE_REQUESTS,                           R.string.change_requests                           );
            put(ITTO.VALIDATED_CHANGES,                         R.string.validated_changes                         );
            put(ITTO.MAKE_OR_BUY_DECISIONS,                     R.string.make_or_buy_decisions                     );
            put(ITTO.PROCUREMENT_STATEMENT_OF_WORK,             R.string.procurement_statement_of_work             );
            put(ITTO.SELLER_PROPOSALS,                          R.string.seller_proposals                          );
            put(ITTO.SOURCE_SELECTION_CRITERIA,                 R.string.source_selection_criteria                 );
            put(ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES,           R.string.project_management_plan_updates           );
            put(ITTO.PROJECT_DOCUMENTS_UPDATES,                 R.string.project_documents_updates                 );
            put(ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES,     R.string.organizational_process_assets_updates     );
            put(ITTO.COST_BASELINE,                             R.string.cost_baseline                             );
            put(ITTO.SCHEDULE_BASELINE,                         R.string.schedule_baseline                         );
            put(ITTO.SELECTED_SELLERS,                          R.string.selected_sellers                          );
            put(ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS_UPDATES,  R.string.enterprise_environmental_factors_updates  );
            put(ITTO.CLOSED_PROCUREMENTS,                       R.string.closed_procurements                       );
            put(ITTO.FINAL_PRODUCT_SERVICE_OR_RESULT_TRANSITION,R.string.final_product_service_or_result_transition);
            put(ITTO.OUTPUTS_FROM_OTHER_PROCESSES,              R.string.outputs_from_other_processes              );

            put(ITTO.EXPERT_JUDGEMENT,                                   R.string.expert_judgement                                  );
            put(ITTO.MEETINGS,                                           R.string.meetings                                          );
            put(ITTO.ANALYTICAL_TECHNIQUES,                              R.string.analytical_techniques                             );
            put(ITTO.RESERVE_ANALYSIS,                                   R.string.reserve_analysis                                  );
            put(ITTO.GROUP_DECISION_MAKING_TECHNIQUES,                   R.string.group_decision_making_techniques                  );
            put(ITTO.PROJECT_MANAGEMENT_SOFTWARE,                        R.string.project_management_software                       );
            put(ITTO.COMMUNICATION_METHODS,                              R.string.communication_methods                             );
            put(ITTO.INFORMATION_MANAGEMENT_SYSTEMS,                     R.string.information_management_systems                    );
            put(ITTO.INTERPERSONAL_SKILLS,                               R.string.interpersonal_skills                              );
            put(ITTO.LEADS_AND_LAGS,                                     R.string.leads_and_lags                                    );
            put(ITTO.ANALOGOUS_ESTIMATING,                               R.string.analogous_estimating                              );
            put(ITTO.BENCHMARKING,                                       R.string.benchmarking                                      );
            put(ITTO.BOTTOM_UP_ESTIMATING,                               R.string.bottom_up_estimating                              );
            put(ITTO.COMMUNICATION_MODELS,                               R.string.communication_models                              );
            put(ITTO.COMMUNICATION_TECHNOLOGY,                           R.string.communication_technology                          );
            put(ITTO.COST_OF_QUALITY,                                    R.string.cost_of_quality                                   );
            put(ITTO.DECOMPOSITION,                                      R.string.decomposition                                     );
            put(ITTO.FACILIATED_WORKSHOPS,                               R.string.faciliated_workshops                              );
            put(ITTO.FACILITATION_TECHNIQUES,                            R.string.facilitation_techniques                           );
            put(ITTO.INSPECTION,                                         R.string.inspection                                        );
            put(ITTO.MODELING_TECHNIQUES,                                R.string.modeling_techniques                               );
            put(ITTO.PARAMETRIC_ESTIMATING,                              R.string.parametric_estimating                             );
            put(ITTO.PERFORMANCE_REPORTING,                              R.string.performance_reporting                             );
            put(ITTO.PERFORMANCE_REVIEWS,                                R.string.performance_reviews                               );
            put(ITTO.PROCUREMENT_NEGOTIATIONS,                           R.string.procurement_negotiations                          );
            put(ITTO.PROJECT_MANAGEMENT_INFORMATION_SYSTEM,              R.string.project_management_information_system             );
            put(ITTO.RECORDS_MANAGEMENT_SYSTEM,                          R.string.records_management_system                         );
            put(ITTO.RESOURCE_OPTIMIZATION_TECHNIQUES,                   R.string.resource_optimization_techniques                  );
            put(ITTO.SCHEDULE_COMPRESSING,                               R.string.schedule_compressing                              );
            put(ITTO.SCHEDULING_TOOL,                                    R.string.scheduling_tool                                   );
            put(ITTO.SEVEN_BASIC_QUALITY_TOOLS,                          R.string.seven_basic_quality_tools                         );
            put(ITTO.STATISTICAL_SAMPLING,                               R.string.statistical_sampling                              );
            put(ITTO.THREE_POINT_ESTIMATING,                             R.string.three_point_estimating                            );
            put(ITTO.STAKEHOLDER_ANALYSIS,                               R.string.stakeholder_analysis                              );
            put(ITTO.CONTEXT_DIAGRAMS,                                   R.string.context_diagrams                                  );
            put(ITTO.DOCUMENT_ANALYSIS,                                  R.string.document_analysis                                 );
            put(ITTO.FOCUS_GROUPS,                                       R.string.focus_groups                                      );
            put(ITTO.GROUP_CREATIVITY_TECHNIQUES,                        R.string.group_creativity_techniques                       );
            put(ITTO.INTERVIEWS,                                         R.string.interviews                                        );
            put(ITTO.OBSERVATIONS,                                       R.string.observations                                      );
            put(ITTO.PROTOTYPES,                                         R.string.prototypes                                        );
            put(ITTO.QUESTIONNAIRES_AND_SURVEYS,                         R.string.questionnaires_and_surveys                        );
            put(ITTO.ALTERNATIVES_GENERATION,                            R.string.alternatives_generation                           );
            put(ITTO.PRODUCT_ANALYSIS,                                   R.string.product_analysis                                  );
            put(ITTO.ROLLING_WAVE_PLANNING,                              R.string.rolling_wave_planning                             );
            put(ITTO.DEPENDENCY_DETERMINATION,                           R.string.dependency_determination                          );
            put(ITTO.PRECEDENCE_DIAGRAMMING_METHOD,                      R.string.precedence_diagramming_method                     );
            put(ITTO.ALTERNATIVE_ANALYSIS,                               R.string.alternative_analysis                              );
            put(ITTO.PUBLISHED_ESTIMATING_DATA,                          R.string.published_estimating_data                         );
            put(ITTO.CRITICAL_PATH_METHOD,                               R.string.critical_path_method                              );
            put(ITTO.CRITICAL_CHAIN_METHOD,                              R.string.critical_chain_method                             );
            put(ITTO.SCHEDULE_NETWORK_ANALYSIS,                          R.string.schedule_network_analysis                         );
            put(ITTO.VENDOR_BID_ANALYSIS,                                R.string.vendor_bid_analysis                               );
            put(ITTO.COST_AGGREGATION,                                   R.string.cost_aggregation                                  );
            put(ITTO.FUNDING_LIMIT_RECONCILIATION,                       R.string.funding_limit_reconciliation                      );
            put(ITTO.HISTORICAL_RELATIONSHIPS,                           R.string.historical_relationships                          );
            put(ITTO.ADDITIONAL_QUALITY_PLANNING,                        R.string.additional_quality_planning                       );
            put(ITTO.COST_BENEFIT_ANALYSIS,                              R.string.cost_benefit_analysis                             );
            put(ITTO.DESIGN_OF_EXPERIMENTS,                              R.string.design_of_experiments                             );
            put(ITTO.NETWORKING,                                         R.string.networking                                        );
            put(ITTO.ORGANIZATION_CHARTS_AND_POSITION_DESCRIPTIONS,      R.string.organization_charts_and_position_descriptions     );
            put(ITTO.ORGANIZATION_THEORY,                                R.string.organization_theory                               );
            put(ITTO.COMMUNICATION_REQUIREMENTS_ANALYSIS,                R.string.communication_requirements_analysis               );
            put(ITTO.ASSUMPTIONS_ANALYSIS,                               R.string.assumptions_analysis                              );
            put(ITTO.CHECKLIST_ANALYSIS,                                 R.string.checklist_analysis                                );
            put(ITTO.DIAGRAMMING_TECHNIQUES,                             R.string.diagramming_techniques                            );
            put(ITTO.DOCUMENTATION_REVIEWS,                              R.string.documentation_reviews                             );
            put(ITTO.INFORMATION_GATHERING_TECHNIQUES,                   R.string.information_gathering_techniques                  );
            put(ITTO.SWOT_ANALYSIS,                                      R.string.swot_analysis                                     );
            put(ITTO.PROBABILITY_AND_IMPACT_MATRIX,                      R.string.probability_and_impact_matrix                     );
            put(ITTO.RISK_CATEGORIZATION,                                R.string.risk_categorization                               );
            put(ITTO.RISK_DATA_QUALITY_ASSESSMENT,                       R.string.risk_data_quality_assessment                      );
            put(ITTO.RISK_PROBABILITY_AND_IMPACT_ASSESSMENT,             R.string.risk_probability_and_impact_assessment            );
            put(ITTO.RISK_URGENCY_ASSESSMENT,                            R.string.risk_urgency_assessment                           );
            put(ITTO.DATA_GATHERING_AND_REPRESENTATION_TECHNIQUES,       R.string.data_gathering_and_representation_techniques      );
            put(ITTO.QUANTITATIVE_RISK_ANALYSIS_AND_MODELING_TECHNIQUES, R.string.quantitative_risk_analysis_and_modeling_techniques);
            put(ITTO.CONTINGENT_RESPONSE_STRATEGIES,                     R.string.contingent_response_strategies                    );
            put(ITTO.STRATEGIES_FOR_NEGATIVE_RISKS_OR_THREATS,           R.string.strategies_for_negative_risks_or_threats          );
            put(ITTO.STRATEGIES_FOR_POSITIVE_RISKS_OR_OPPORTUNITIES,     R.string.strategies_for_positive_risks_or_opportunities    );
            put(ITTO.MAKE_OR_BUY_ANALYSIS,                               R.string.make_or_buy_analysis                              );
            put(ITTO.MARKET_RESEARCH,                                    R.string.market_research                                   );
            put(ITTO.PROCESS_ANALYSIS,                                   R.string.process_analysis                                  );
            put(ITTO.QUALITY_AUDITS,                                     R.string.quality_audits                                    );
            put(ITTO.QUALITY_MANAGEMENT_AND_CONTROL_TOOLS,               R.string.quality_management_and_control_tools              );
            put(ITTO.ACQUISITION,                                        R.string.acquisition                                       );
            put(ITTO.MULTI_CRITERIA_DECISION_ANALYSIS,                   R.string.multi_criteria_decision_analysis                  );
            put(ITTO.NEGOTIATION,                                        R.string.negotiation                                       );
            put(ITTO.PRE_ASSIGNMENT,                                     R.string.pre_assignment                                    );
            put(ITTO.VIRTUAL_TEAMS,                                      R.string.virtual_teams                                     );
            put(ITTO.COLOCATION,                                         R.string.colocation                                        );
            put(ITTO.GROUND_RULES,                                       R.string.ground_rules                                      );
            put(ITTO.PERSONNEL_ASSESSMENT_TOOLS,                         R.string.personnel_assessment_tools                        );
            put(ITTO.RECOGNITION_AND_REWARDS,                            R.string.recognition_and_rewards                           );
            put(ITTO.TEAM_BUILDING_ACTIVITIES,                           R.string.team_building_activities                          );
            put(ITTO.TRAINING,                                           R.string.training                                          );
            put(ITTO.CONFLICT_MANAGEMENT,                                R.string.conflict_management                               );
            put(ITTO.OBSERVATION_AND_CONVERSATION,                       R.string.observation_and_conversation                      );
            put(ITTO.PROJECT_PERFORMANCE_APPRAISALS,                     R.string.project_performance_appraisals                    );
            put(ITTO.ADVERTISING,                                        R.string.advertising                                       );
            put(ITTO.BIDDER_CONFERENCE,                                  R.string.bidder_conference                                 );
            put(ITTO.INDEPENDENT_ESTIMATES,                              R.string.independent_estimates                             );
            put(ITTO.PROPOSAL_EVALUATION_TECHNIQUES,                     R.string.proposal_evaluation_techniques                    );
            put(ITTO.MANAGEMENT_SKILLS,                                  R.string.management_skills                                 );
            put(ITTO.VARIANCE_ANALYSIS,                                  R.string.variance_analysis                                 );
            put(ITTO.EARNED_VALUE_MANAGEMENT,                            R.string.earned_value_management                           );
            put(ITTO.FORECASTING,                                        R.string.forecasting                                       );
            put(ITTO.TO_COMPLETE_PERFORMANCE_INDEX,                      R.string.to_complete_performance_index                     );
            put(ITTO.APPROVED_CHANGE_REQUESTS_REVIEW,                    R.string.approved_change_requests_review                   );
            put(ITTO.RISK_AUDITS,                                        R.string.risk_audits                                       );
            put(ITTO.RISK_REASSESSMENT,                                  R.string.risk_reassessment                                 );
            put(ITTO.TECHNICAL_PERFORMANCE_MEASUREMENT,                  R.string.technical_performance_measurement                 );
            put(ITTO.VARIANCE_AND_TREND_ANALYSIS,                        R.string.variance_and_trend_analysis                       );
            put(ITTO.CLAIM_ADMINISTRATION,                               R.string.claim_administration                              );
            put(ITTO.CONTRACT_CHANGE_CONTROL_SYSTEM,                     R.string.contract_change_control_system                    );
            put(ITTO.INSPECTIONS_AND_AUDITS,                             R.string.inspections_and_audits                            );
            put(ITTO.PAYMENT_SYSTEM,                                     R.string.payment_system                                    );
            put(ITTO.PROCUREMENT_PERFORMANCE_REVIEWS,                    R.string.procurement_performance_reviews                   );
            put(ITTO.CHANGE_CONTROL_TOOLS,                               R.string.change_control_tools                              );
            put(ITTO.PROCUREMENT_AUDITS,                                 R.string.procurement_audits                                );
        }
    };

    public static ArrayList<ITTO> ittoFullList = new ArrayList<ITTO>() {
        {
            add(ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
            add(ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
            add(ITTO.PROJECT_MANAGEMENT_PLAN);
            add(ITTO.SCOPE_MANAGEMENT_PLAN);
            add(ITTO.REQUIREMENTS_MANAGEMENT_PLAN);
            add(ITTO.SCHEDULE_MANAGEMENT_PLAN);
            add(ITTO.COST_MANAGEMENT_PLAN);
            add(ITTO.QUALITY_MANAGEMENT_PLAN);
            add(ITTO.PROCESS_IMPROVEMENT_PLAN);
            add(ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);
            add(ITTO.COMMUNICATIONS_MANAGEMENT_PLAN);
            add(ITTO.RISK_MANAGEMENT_PLAN);
            add(ITTO.PROCUREMENT_MANAGEMENT_PLAN);
            add(ITTO.STAKEHOLDER_MANAGEMENT_PLAN);
            add(ITTO.SCOPE_BASELINE);
            add(ITTO.PROJECT_SCOPE_STATEMENT);
            add(ITTO.RISK_REGISTER);
            add(ITTO.WORK_PERFORMANCE_DATA);
            add(ITTO.PROJECT_CHARTER);
            add(ITTO.STAKEHOLDER_REGISTER);
            add(ITTO.REQUIREMENT_DOCUMENTATION);
            add(ITTO.PROCUREMENT_DOCUMENTS);
            add(ITTO.PROJECT_DOCUMENTS);
            add(ITTO.RESOURCE_CALENDAR);
            add(ITTO.WORK_PERFORMANCE_REPORTS);
            add(ITTO.ACTIVITY_LIST);
            add(ITTO.ACTIVITY_ATTRIBUTES);
            add(ITTO.ACTIVITY_RESOURCE_REQUIREMENTS);
            add(ITTO.PROJECT_SCHEDULE);
            add(ITTO.ACTIVITY_COST_ESTIMATES);
            add(ITTO.AGREEMENTS);
            add(ITTO.PROJECT_STAFF_ASSIGNMENTS);
            add(ITTO.ISSUE_LOG);
            add(ITTO.APPROVED_CHANGE_REQUESTS);
            add(ITTO.REQUIREMENTS_TRACEABILITY_MATRIX);
            add(ITTO.RESOURCE_BREAKDOWN_STRUCTURE);
            add(ITTO.ACTIVITY_DURATION_ESTIMATES);
            add(ITTO.QUALITY_METRICS);
            add(ITTO.PROJECT_STATEMENT_OF_WORK);
            add(ITTO.BUSINESS_CASE);
            add(ITTO.PROJECT_SCHEDULE_NETWORK_DIAGRAM);
            add(ITTO.MILESTONE_LIST);
            add(ITTO.PROJECT_CALENDAR);
            add(ITTO.SCHEDULE_DATA);
            add(ITTO.SCHEDULE_FORECASTS);
            add(ITTO.BASIS_OF_ESTIMATES);
            add(ITTO.COST_FORECASTS);
            add(ITTO.PROJECT_FUNDING_REQUIREMENTS);
            add(ITTO.TEAM_PERFORMANCED_ASSESSMENTS);
            add(ITTO.PROJECT_COMMUNICATIONS);
            add(ITTO.QUALITY_CHECKLISTS);
            add(ITTO.QUALITY_CONTROL_MEASUREMENTS);
            add(ITTO.DELIVERABLES);
            add(ITTO.VERIFIED_DELIVERABLES);
            add(ITTO.ACCEPTED_DELIVERABLES);
            add(ITTO.WORK_PERFORMANCE_INFORMATION);
            add(ITTO.CHANGE_LOG);
            add(ITTO.CHANGE_REQUESTS);
            add(ITTO.VALIDATED_CHANGES);
            add(ITTO.MAKE_OR_BUY_DECISIONS);
            add(ITTO.PROCUREMENT_STATEMENT_OF_WORK);
            add(ITTO.SELLER_PROPOSALS);
            add(ITTO.SOURCE_SELECTION_CRITERIA);
            add(ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
            add(ITTO.PROJECT_DOCUMENTS_UPDATES);
            add(ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
            add(ITTO.COST_BASELINE);
            add(ITTO.SCHEDULE_BASELINE);
            add(ITTO.SELECTED_SELLERS);
            add(ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS_UPDATES);
            add(ITTO.CLOSED_PROCUREMENTS);
            add(ITTO.FINAL_PRODUCT_SERVICE_OR_RESULT_TRANSITION);
            add(ITTO.OUTPUTS_FROM_OTHER_PROCESSES);

            add(ITTO.EXPERT_JUDGEMENT);
            add(ITTO.MEETINGS);
            add(ITTO.ANALYTICAL_TECHNIQUES);
            add(ITTO.RESERVE_ANALYSIS);
            add(ITTO.GROUP_DECISION_MAKING_TECHNIQUES);
            add(ITTO.PROJECT_MANAGEMENT_SOFTWARE);
            add(ITTO.COMMUNICATION_METHODS);
            add(ITTO.INFORMATION_MANAGEMENT_SYSTEMS);
            add(ITTO.INTERPERSONAL_SKILLS);
            add(ITTO.LEADS_AND_LAGS);
            add(ITTO.ANALOGOUS_ESTIMATING);
            add(ITTO.BENCHMARKING);
            add(ITTO.BOTTOM_UP_ESTIMATING);
            add(ITTO.COMMUNICATION_MODELS);
            add(ITTO.COMMUNICATION_TECHNOLOGY);
            add(ITTO.COST_OF_QUALITY);
            add(ITTO.DECOMPOSITION);
            add(ITTO.FACILIATED_WORKSHOPS);
            add(ITTO.FACILITATION_TECHNIQUES);
            add(ITTO.INSPECTION);
            add(ITTO.MODELING_TECHNIQUES);
            add(ITTO.PARAMETRIC_ESTIMATING);
            add(ITTO.PERFORMANCE_REPORTING);
            add(ITTO.PERFORMANCE_REVIEWS);
            add(ITTO.PROCUREMENT_NEGOTIATIONS);
            add(ITTO.PROJECT_MANAGEMENT_INFORMATION_SYSTEM);
            add(ITTO.RECORDS_MANAGEMENT_SYSTEM);
            add(ITTO.RESOURCE_OPTIMIZATION_TECHNIQUES);
            add(ITTO.SCHEDULE_COMPRESSING);
            add(ITTO.SCHEDULING_TOOL);
            add(ITTO.SEVEN_BASIC_QUALITY_TOOLS);
            add(ITTO.STATISTICAL_SAMPLING);
            add(ITTO.THREE_POINT_ESTIMATING);
            add(ITTO.STAKEHOLDER_ANALYSIS);
            add(ITTO.CONTEXT_DIAGRAMS);
            add(ITTO.DOCUMENT_ANALYSIS);
            add(ITTO.FOCUS_GROUPS);
            add(ITTO.GROUP_CREATIVITY_TECHNIQUES);
            add(ITTO.INTERVIEWS);
            add(ITTO.OBSERVATIONS);
            add(ITTO.PROTOTYPES);
            add(ITTO.QUESTIONNAIRES_AND_SURVEYS);
            add(ITTO.ALTERNATIVES_GENERATION);
            add(ITTO.PRODUCT_ANALYSIS);
            add(ITTO.ROLLING_WAVE_PLANNING);
            add(ITTO.DEPENDENCY_DETERMINATION);
            add(ITTO.PRECEDENCE_DIAGRAMMING_METHOD);
            add(ITTO.ALTERNATIVE_ANALYSIS);
            add(ITTO.PUBLISHED_ESTIMATING_DATA);
            add(ITTO.CRITICAL_PATH_METHOD);
            add(ITTO.CRITICAL_CHAIN_METHOD);
            add(ITTO.SCHEDULE_NETWORK_ANALYSIS);
            add(ITTO.VENDOR_BID_ANALYSIS);
            add(ITTO.COST_AGGREGATION);
            add(ITTO.FUNDING_LIMIT_RECONCILIATION);
            add(ITTO.HISTORICAL_RELATIONSHIPS);
            add(ITTO.ADDITIONAL_QUALITY_PLANNING);
            add(ITTO.COST_BENEFIT_ANALYSIS);
            add(ITTO.DESIGN_OF_EXPERIMENTS);
            add(ITTO.NETWORKING);
            add(ITTO.ORGANIZATION_CHARTS_AND_POSITION_DESCRIPTIONS);
            add(ITTO.ORGANIZATION_THEORY);
            add(ITTO.COMMUNICATION_REQUIREMENTS_ANALYSIS);
            add(ITTO.ASSUMPTIONS_ANALYSIS);
            add(ITTO.CHECKLIST_ANALYSIS);
            add(ITTO.DIAGRAMMING_TECHNIQUES);
            add(ITTO.DOCUMENTATION_REVIEWS);
            add(ITTO.INFORMATION_GATHERING_TECHNIQUES);
            add(ITTO.SWOT_ANALYSIS);
            add(ITTO.PROBABILITY_AND_IMPACT_MATRIX);
            add(ITTO.RISK_CATEGORIZATION);
            add(ITTO.RISK_DATA_QUALITY_ASSESSMENT);
            add(ITTO.RISK_PROBABILITY_AND_IMPACT_ASSESSMENT);
            add(ITTO.RISK_URGENCY_ASSESSMENT);
            add(ITTO.DATA_GATHERING_AND_REPRESENTATION_TECHNIQUES);
            add(ITTO.QUANTITATIVE_RISK_ANALYSIS_AND_MODELING_TECHNIQUES);
            add(ITTO.CONTINGENT_RESPONSE_STRATEGIES);
            add(ITTO.STRATEGIES_FOR_NEGATIVE_RISKS_OR_THREATS);
            add(ITTO.STRATEGIES_FOR_POSITIVE_RISKS_OR_OPPORTUNITIES);
            add(ITTO.MAKE_OR_BUY_ANALYSIS);
            add(ITTO.MARKET_RESEARCH);
            add(ITTO.PROCESS_ANALYSIS);
            add(ITTO.QUALITY_AUDITS);
            add(ITTO.QUALITY_MANAGEMENT_AND_CONTROL_TOOLS);
            add(ITTO.ACQUISITION);
            add(ITTO.MULTI_CRITERIA_DECISION_ANALYSIS);
            add(ITTO.NEGOTIATION);
            add(ITTO.PRE_ASSIGNMENT);
            add(ITTO.VIRTUAL_TEAMS);
            add(ITTO.COLOCATION);
            add(ITTO.GROUND_RULES);
            add(ITTO.PERSONNEL_ASSESSMENT_TOOLS);
            add(ITTO.RECOGNITION_AND_REWARDS);
            add(ITTO.TEAM_BUILDING_ACTIVITIES);
            add(ITTO.TRAINING);
            add(ITTO.CONFLICT_MANAGEMENT);
            add(ITTO.OBSERVATION_AND_CONVERSATION);
            add(ITTO.PROJECT_PERFORMANCE_APPRAISALS);
            add(ITTO.ADVERTISING);
            add(ITTO.BIDDER_CONFERENCE);
            add(ITTO.INDEPENDENT_ESTIMATES);
            add(ITTO.PROPOSAL_EVALUATION_TECHNIQUES);
            add(ITTO.MANAGEMENT_SKILLS);
            add(ITTO.VARIANCE_ANALYSIS);
            add(ITTO.EARNED_VALUE_MANAGEMENT);
            add(ITTO.FORECASTING);
            add(ITTO.TO_COMPLETE_PERFORMANCE_INDEX);
            add(ITTO.APPROVED_CHANGE_REQUESTS_REVIEW);
            add(ITTO.RISK_AUDITS);
            add(ITTO.RISK_REASSESSMENT);
            add(ITTO.TECHNICAL_PERFORMANCE_MEASUREMENT);
            add(ITTO.VARIANCE_AND_TREND_ANALYSIS);
            add(ITTO.CLAIM_ADMINISTRATION);
            add(ITTO.CONTRACT_CHANGE_CONTROL_SYSTEM);
            add(ITTO.INSPECTIONS_AND_AUDITS);
            add(ITTO.PAYMENT_SYSTEM);
            add(ITTO.PROCUREMENT_PERFORMANCE_REVIEWS);
            add(ITTO.CHANGE_CONTROL_TOOLS);
            add(ITTO.PROCUREMENT_AUDITS);
        }
    };
}
